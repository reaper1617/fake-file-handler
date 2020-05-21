package com.example.fileabstract.service;

public interface FileHandler {
    void download(Object source);
    void upload(Object dest);
    String getHandlingFileExtension();
}
