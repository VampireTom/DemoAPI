package com.example.demoAPI.service;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadServie {
	
	public Object uploadMutiFile(MultipartFile[] files) {
		try {
			for(MultipartFile file : files) {
				Files.write(Paths.get("E:/Workspace/temp/" + file.getOriginalFilename()), file.getBytes());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
