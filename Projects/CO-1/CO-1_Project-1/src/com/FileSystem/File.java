package com.FileSystem;

class File extends FileSystemElement{
	private String name;

    public File(FileSystemImplementation implementation, String name) {
        super(implementation);
        this.name = name;
    }

    @Override
    public void add(FileSystemElement element) {
        // No implementation needed for files
    }

    @Override
    public void remove(FileSystemElement element) {
        // No implementation needed for files
    }

    @Override
    public void display() {
        implementation.displayElement(name);
    }
}
