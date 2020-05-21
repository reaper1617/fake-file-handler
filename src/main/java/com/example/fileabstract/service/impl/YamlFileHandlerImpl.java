package com.example.fileabstract.service.impl;

import com.example.fileabstract.service.FileHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class YamlFileHandlerImpl implements FileHandler {

    @Override
    public void download(Object source) {
        log.info("Fake download from " + this.getClass().getName());
    }

    @Override
    public void upload(Object dest) {
        log.info("Fake upload from " + this.getClass().getName());
    }

    @Override
    public String getHandlingFileExtension() {
        return "yaml";
    }
}
