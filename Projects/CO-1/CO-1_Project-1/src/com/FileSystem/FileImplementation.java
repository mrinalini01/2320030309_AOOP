package com.FileSystem;

public class FileImplementation implements FileSystemImplementation {

    @Override
    public void addElement(FileSystemElement element) {
        // No implementation needed for files
    }

    @Override
    public void removeElement(FileSystemElement element) {
        // No implementation needed for files
    }

    @Override
    public void displayElement(String name) {
        System.out.println("File: " + name);
    }
}
