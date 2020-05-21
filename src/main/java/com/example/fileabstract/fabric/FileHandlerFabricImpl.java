package com.example.fileabstract.fabric;

import com.example.fileabstract.service.FileHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FileHandlerFabricImpl implements FileHanderFabric {

    private final List<FileHandler> fileHandlers;

    @Autowired
    FileHandlerFabricImpl(List<FileHandler> fileHandlers) {
        this.fileHandlers = fileHandlers;
    }

    @Override
    public FileHandler getInstance(String fileType) {
        Optional<FileHandler> fileHandlerOpt = fileHandlers.stream()
                .filter(fh -> fh.getHandlingFileExtension().equalsIgnoreCase(fileType))
                .findAny();
        if (fileHandlerOpt.isPresent()) return fileHandlerOpt.get();
        else throw new IllegalArgumentException(String.format("No bean for %s type handling", fileType));
    }
}
