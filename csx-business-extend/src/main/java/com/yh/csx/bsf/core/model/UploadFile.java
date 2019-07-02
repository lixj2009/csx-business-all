package com.yh.csx.bsf.core.model;

public class UploadFile {

	private String fileUrl;

	private String fileName;

	public UploadFile() {
	}

	public UploadFile(String fileUrl, String fileName) {
		this.fileUrl = fileUrl;
		this.fileName = fileName;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
