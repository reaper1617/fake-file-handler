package com.example.fileabstract.service;

import com.example.fileabstract.fabric.FileHanderFabric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsefulService {

    private final FileHanderFabric fileHanderFabric;

    @Autowired
    public UsefulService(FileHanderFabric fileHanderFabric) {
        this.fileHanderFabric = fileHanderFabric;
    }

    public void doFileHandlingExample(){
        fileHanderFabric.getInstance("yaml").download("From yaml");

        fileHanderFabric.getInstance("md").upload("Upload MD");
    }
}
