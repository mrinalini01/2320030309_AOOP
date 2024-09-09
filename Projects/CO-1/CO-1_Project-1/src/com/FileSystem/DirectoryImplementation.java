package com.FileSystem;

public class DirectoryImplementation implements FileSystemImplementation {

    @Override
    public void addElement(FileSystemElement element) {
        // Directory specific logic for adding an element
    }

    @Override
    public void removeElement(FileSystemElement element) {
        // Directory specific logic for removing an element
    }

    @Override
    public void displayElement(String name) {
        System.out.println("Directory: " + name);
    }
}
