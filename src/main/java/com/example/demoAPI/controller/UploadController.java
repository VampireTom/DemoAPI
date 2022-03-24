package com.example.demoAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demoAPI.service.UploadServie;

@RestController
@RequestMapping(path = "/upload")
@CrossOrigin
public class UploadController {
	
	@Autowired
	UploadServie uploadServie;
	
	@PostMapping("/mutifile")
	public Object uploadMutiFile(@RequestBody MultipartFile[] files) {
		uploadServie.uploadMutiFile(files);
		return "Success";
	}
	
}
