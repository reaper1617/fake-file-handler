package com.example.fileabstract.fabric;

import com.example.fileabstract.service.FileHandler;

public interface FileHanderFabric {
    FileHandler getInstance(String fileType);
}
