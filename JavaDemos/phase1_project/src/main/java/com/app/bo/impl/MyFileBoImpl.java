package com.app.bo.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.app.bo.MyFileBO;
import com.app.exception.BusinessException;
import com.app.model.MyFile;

public class MyFileBoImpl implements MyFileBO {
	
	private boolean checkSpc(String name) {
		if(name.replaceAll("[a-zA-Z0-9]", "").length() > 0) {
			return false;
		}
		return true;
	}
	
	private boolean valid(String fileName) {
		String parts[] = fileName.split("[\\.]");
		if (parts.length > 2) {
			return false;
		} else if(checkSpc(parts[0]) && checkSpc(parts[1])) {
			return true;
		}
		return false;
	}

	@Override
	public MyFile createFile(MyFile newFile) throws BusinessException, IOException {
		String fileName = newFile.getName();
		
		if (!fileName.contains(".")) {
			fileName = fileName + ".txt";
		}
		if (!valid(fileName)) {
			throw new BusinessException("Invalid File Name!");
		}
		
		String filePath = MyFile.absPath+fileName;
		File file = new File(filePath);
		file.getParentFile().mkdirs();
		if (!file.exists()) {
			file.createNewFile();
		} else {
			throw new BusinessException("File Already Exists!");
		}
		
		FileWriter fw = new FileWriter(filePath, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(newFile.getContent());
		
		bw.close();
		fw.close();
		
		newFile.setName(fileName);		
		newFile.setSize(file.length());
		newFile.setPath(file.getAbsolutePath());
		newFile.setLastModified(file.lastModified());

		return newFile;
	}

	@Override
	public MyFile getFileByName(String fileName) throws BusinessException, FileNotFoundException, IOException {
		File dir = new File(MyFile.absPath);
		MyFile target = null;
		for (File curr : dir.listFiles()) {
			if (curr.getName().equals(fileName)) {
				String s = "";
				StringBuilder sb = new StringBuilder();
				FileReader fr = new FileReader(curr.getAbsolutePath());
				BufferedReader br = new BufferedReader(fr);
				while ((s = br.readLine())!=null) {
					sb.append(s);
				}
				String fileContent = sb.toString();
				target = new MyFile(
						curr.getName(),
						curr.getAbsolutePath(),
						curr.length(),
						curr.lastModified(),
						fileContent);
				br.close();
				fr.close();
				break;
			}
		}
		if (target == null) {
			throw new BusinessException("No such file exists!");
		}
		return target;
	}

	@Override
	public boolean deleteFileByName(String fileName) throws FileNotFoundException, IOException, BusinessException {
		MyFile target = this.getFileByName(fileName);
		boolean deleted = false;
		if (target == null) {
			throw new BusinessException("No such file exists!");
		} else {
			deleted = new File(target.getPath()).delete();
		}
		if (!deleted) {
			throw new BusinessException("Failed to delete the file!");
		}
		return deleted;
	}

	@Override
	public List<MyFile> listAllFiles() throws BusinessException, FileNotFoundException, IOException {
		
		List<MyFile> fileList = new LinkedList<>();
		
		File dir = new File(MyFile.absPath);
		if (dir.exists()) {
			File[] files_in_dir = dir.listFiles();
	
			for(File file : files_in_dir) {
				String s = "";
				StringBuilder sb = new StringBuilder();
				FileReader fr = new FileReader(file.getAbsolutePath());
				BufferedReader br = new BufferedReader(fr);
				while ((s = br.readLine())!=null) {
					sb.append(s);
				}
				String fileContent = sb.toString();
				
				fileList.add( new MyFile(
					file.getName(),
					file.getAbsolutePath(),
					file.length(),
					file.lastModified(),
					fileContent
				));
				br.close();
				fr.close();
			}
			
			// sorting the list in ascending order of name
			// although they can be already be in sorted position.
			// this is where Colections.sort() can be used
			Collections.sort(fileList, (MyFile f1, MyFile f2) -> {
				return f1.getName().compareTo(f2.getName());
			});
			
			return fileList;
		}
		else {
			throw new BusinessException("Sorry, root directory missing!");
		}
	}

}
