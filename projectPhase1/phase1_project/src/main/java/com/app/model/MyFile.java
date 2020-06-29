package com.app.model;

public class MyFile {
	
	private String name;
	private String path;
	private double size;
	private long lastModified;
	private String content; 
	
	public static String absPath = "root/";
	
	public MyFile() {
		// TODO Auto-generated constructor stub
	}

	public MyFile(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}

	public MyFile(String name, String path, double size, long lastModified, String content) {
		super();
		this.name = name;
		this.path = path;
		this.size = size;
		this.lastModified = lastModified;
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public long getLastModified() {
		return lastModified;
	}

	public void setLastModified(long lastModified) {
		this.lastModified = lastModified;
	}

	@Override
	public String toString() {
		return "MyFile [name=" + name + ", path=" + path + ", size=" + size + ", lastModified=" + lastModified
				+ "]";
	}

}
