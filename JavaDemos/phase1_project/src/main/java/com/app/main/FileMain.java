package com.app.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.app.bo.impl.MyFileBoImpl;
import com.app.exception.BusinessException;
import com.app.model.MyFile;

public class FileMain {

	public static void main(String[] args) {
		
		int choice = 0;
		// do not change 'absPath' unless you want to mount to your own location; 
		MyFile.absPath = "root/"; // mounting location;
		Scanner sc = new Scanner(System.in);
		MyFileBoImpl fileBO = new MyFileBoImpl();
		
		/* This is our welcome screen; */
		System.out.println("\nWelcome To FileExplorer!");
		System.out.println(new String(new char[60]).replace("\0", "-"));
		System.out.println("Developed by: Kunal Acharya");
		System.out.println("Email: kunalacharya58@gmail.com");
		System.out.println("Choose any of the option and press Enter!");
		System.out.println(new String(new char[60]).replace("\0", "-"));
		/* end of welcome screen; */
		
		do {
			/* This is my main menu; */
			System.out.println("\n-------- Main Menu --------\n");
			System.out.println("1. List All Files.");
			System.out.println("2. More Operations.");
			System.out.println("3. Exit.");
			/* end of main menu */
			
			// user selects an option;
			try {
				System.out.print(">>Enter your choice: ");
				choice = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				choice = 99;
			}
			
			// we let the choice be switched to relevant case;
			switch(choice) {
			
			case 1: {
				// this case should show the file list;
				try {
					System.out.println("\nShowing files in \""+MyFile.absPath+"\"");
					List<MyFile> fileList = fileBO.listAllFiles();
					System.out.println(new String(new char[60]).replace("\0", "-"));
					System.out.println("Name\t\t   Size\t\tType\tDate Modified");
					System.out.println(new String(new char[60]).replace("\0", "-"));
					
					for (MyFile file : fileList) {
						String datePattern = "yyyy-MM-dd hh:mm aa";
						String name = file.getName().split("[\\.]")[0];
						String ext = file.getName().split("[\\.]")[1].toUpperCase();
						long size = (int)file.getSize();
						String date = new SimpleDateFormat(datePattern).
								format(new Date(file.getLastModified()));
						String fileSize = String.format("%3d", size);
						System.out.println(name+"\t\t"+fileSize+" bytes\t"+ext+"\t"+date);
					}					
				} catch(BusinessException e) {
					System.out.println(e.getMessage());
				} catch (FileNotFoundException e) {
					System.out.println("File Not Found!");
				} catch (IOException e) {
					System.out.println("There was some problem...");
				}
				System.out.println(new String(new char[60]).replace("\0", "-"));
				break;
			}
			// end of case 1 - main menu
				
			case 2: {
				// this case provides another sub-menu for file operations;
				int subch = 0;
				do {
					/* This is out sub-menu which will only be visible for Option-2 of main menu */
					System.out.println("\n\t------ More Operations ------\n");
					System.out.println("\t1. Add a new file.");
					System.out.println("\t2. Delete a file.");
					System.out.println("\t3. Search a file.");
					System.out.println("\t4. Go back.");
					/* end of sub menu */
					
					// user selects an option;
					try {
						System.out.print("\t>>Enter your choice: ");
						subch = Integer.parseInt(sc.nextLine());
					} catch (NumberFormatException e) {
						subch = 99;
					}
					
					// let the choice be switched to a relevant case for sub-menu;
					switch(subch) {
					
					case 1: {
						// this case will create a file;
						System.out.println("\n[1. ADD A NEW FILE]");
						System.out.print("Enter File Name: ");
						String filename = sc.nextLine();
						
						System.out.println("Write something inside the file: ");
						String content = sc.nextLine();
						
						System.out.println(new String(new char[60]).replace("\0", "-"));
						MyFile file = new MyFile(filename, content);
						try {
							file =  fileBO.createFile(file);
							if (file != null) {
								SimpleDateFormat dateFormat = 
										new SimpleDateFormat("yyyy-MM-dd hh:mm aa");
								
								System.out.println("***File Created Succesfully***");
								System.out.println("\nFile: "+file.getName());
								System.out.println("Size: "+file.getSize()+" bytes");
								System.out.println("Path: "+file.getPath());
								System.out.println("Last Modified: "+dateFormat.format(
											new Date(file.getLastModified()) ));
							}
						} catch (BusinessException e) {
							System.out.println(e.getMessage());
						} catch (IOException e) {
							System.out.println("Could not create a file!");
						}
						System.out.println(new String(new char[60]).replace("\0", "-"));
						break;
					}
					// end of case 1 - sub-menu
						
					case 2: {
						// this case will delete a file;
						System.out.println("\n[2. DELETE AN EXISTING FILE]");
						System.out.print("Enter File Name: ");
						String filename = sc.nextLine();
						System.out.println(new String(new char[60]).replace("\0", "-"));
						System.out.println("Looking for "+filename+" in \""+MyFile.absPath+"\"");
						System.out.println();
						try {
							if(fileBO.deleteFileByName(filename)) {
								System.out.println("***File deleted succesfully***");
							}
						} catch(BusinessException e) {
							System.out.println(e.getMessage());
						} catch(FileNotFoundException e) {
							System.out.println("Could not find the file!");
						} catch(IOException e) {
							System.out.println("There was some problem...");
						}
						System.out.println(new String(new char[60]).replace("\0", "-"));
						break;
					}
					// end of case 2 - sub-menu
						
					case 3: {
						// this case will search for a file;
						System.out.println("\n[3. SEARCH FOR A FILE]");
						System.out.print("Enter File Name: ");
						String filename = sc.nextLine();
						System.out.println(new String(new char[60]).replace("\0", "-"));
						System.out.println("Looking for "+filename+" in \""+MyFile.absPath+"\"");
						System.out.println(new String(new char[60]).replace("\0", "-"));
						try {
							MyFile foundFile = fileBO.getFileByName(filename);
							if (foundFile != null) {
								SimpleDateFormat dateFormat = 
										new SimpleDateFormat("yyyy-MM-dd hh:mm aa");
								
								System.out.println("***File Found***");
								System.out.println("\nName: "+foundFile.getName());
								System.out.println("Size: "+foundFile.getSize()+" bytes");
								System.out.println("Location: "+foundFile.getPath());
								System.out.println("Modified: "+dateFormat.format(new Date(foundFile.getLastModified())));
							} else {
								System.out.println("No such file exists!");
							}
						} catch (BusinessException e) {
							System.out.println(e.getMessage());
						} catch (FileNotFoundException e) {
							System.out.println("Sorry, could not find the specified file!");
						} catch (IOException e) {
							System.out.println("There was some problem...");
						}
						System.out.println(new String(new char[60]).replace("\0", "-"));
						break;
					}
					// end of case 3 - sub-menu
						
					case 4: {
						// take the user back to main menu;
						System.out.println("\nBack to main menu!");
						break;
					}
					// end of case 4 - sub-menu
					
					default:
						System.out.println("\nInvalid Option! Try again!");break;
					}
					
				} while (subch != 4);
				// end of sub-menu
				
				break;
			}
			// end of case 2 - main menu
				
			case 3: {
				// this case will close the application;
				System.out.println("\nThank You for using our application! ");
				System.out.println("Good Bye!");
				break;
			}
			// end of case 3 - main menu
			
			default:
				// invalid entry;
				System.out.println("\nInvalid Option! Try again!");break;
			}
			// end of switch for main-menu
			
		} while (choice != 3);
		sc.close();
	}

}
