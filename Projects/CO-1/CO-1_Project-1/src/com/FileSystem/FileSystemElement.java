package com.FileSystem;

public abstract class FileSystemElement {
	protected FileSystemImplementation implementation;

    public FileSystemElement(FileSystemImplementation implementation) {
        this.implementation = implementation;
    }

    public abstract void add(FileSystemElement element);
    public abstract void remove(FileSystemElement element);
    public abstract void display();
}
