package com.app.bo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.MyFile;

public interface MyFileBO {
	public MyFile createFile(MyFile newFile) throws BusinessException, IOException;
	public MyFile getFileByName(String fileName) throws BusinessException, FileNotFoundException, IOException;
	public boolean deleteFileByName(String fileName) throws FileNotFoundException, IOException;
	public List<MyFile> listAllFiles() throws BusinessException, FileNotFoundException, IOException;
}
