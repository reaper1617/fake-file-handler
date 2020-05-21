package com.example.fileabstract;

import com.example.fileabstract.fabric.FileHanderFabric;
import com.example.fileabstract.service.UsefulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class FileAbstractApplication {

    private UsefulService usefulService;

    @Autowired
    public FileAbstractApplication(UsefulService usefulService) {
        this.usefulService = usefulService;
    }

    @PostConstruct
    void postConstruct(){
        usefulService.doFileHandlingExample();
    }

    public static void main(String[] args) {
        SpringApplication.run(FileAbstractApplication.class, args);

    }

}
