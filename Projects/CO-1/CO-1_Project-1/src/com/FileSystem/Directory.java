package com.FileSystem;

import java.util.ArrayList;
import java.util.List;

class Directory extends FileSystemElement{
	
	private String name;
    private List<FileSystemElement> elements = new ArrayList<>();

    public Directory(FileSystemImplementation implementation, String name) {
        super(implementation);
        this.name = name;
    }

    @Override
    public void add(FileSystemElement element) {
        elements.add(element);
    }

    @Override
    public void remove(FileSystemElement element) {
        elements.remove(element);
    }

    @Override
    public void display() {
        implementation.displayElement(name);
        for (FileSystemElement element : elements) {
            element.display();
        }
    }
}
