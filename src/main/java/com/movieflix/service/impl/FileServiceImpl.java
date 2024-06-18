package com.movieflix.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.movieflix.service.FileService;

@Service
public class FileServiceImpl implements FileService{

	@Override
	public String uploadFile(String path, MultipartFile file) throws IOException {
		// get name of the file
		String fileName = file.getOriginalFilename();
		
		// to get the file path
		String filePath = path + File.separator + fileName;
		
		//create file
		File f = new File(path);
		
		if(!f.exists()) {
			f.mkdir();
		}
		
		// copy the file or upload file to the path
		Files.copy(file.getInputStream(), Paths.get(filePath),StandardCopyOption.REPLACE_EXISTING);
		
		return fileName;
	}

	@Override
	public InputStream getResourceFile(String path, String fileName) throws FileNotFoundException {
		
		String filePath = path + File.separator + fileName;
		
		
		return new FileInputStream(filePath) ;
	}

}
