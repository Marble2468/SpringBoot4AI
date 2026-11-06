package com.mysite.springboot4.service;

import com.mysite.springboot4.dto.UploadResponse;

public interface FileStorageService {
    UploadResponse store(byte[] bytes, String filename);
}
