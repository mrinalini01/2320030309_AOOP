package com.FileSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileSystemTest {

    private FileSystemImplementation fileImpl;
    private FileSystemImplementation dirImpl;
    private Directory rootDirectory;

    @BeforeEach
    void setUp() {
        fileImpl = new FileImplementation();
        dirImpl = new DirectoryImplementation();
        rootDirectory = new Directory(dirImpl, "root");
    }

    @Test
    void testAddAndDisplay() {
        File file1 = new File(fileImpl, "file1.txt");
        File file2 = new File(fileImpl, "file2.txt");
        Directory subDirectory = new Directory(dirImpl, "subdir");

        rootDirectory.add(file1);
        rootDirectory.add(subDirectory);
        subDirectory.add(file2);

        rootDirectory.display();
    }

    @Test
    void testRemove() {
        File file1 = new File(fileImpl, "file1.txt");
        Directory subDirectory = new Directory(dirImpl, "subdir");

        rootDirectory.add(file1);
        rootDirectory.add(subDirectory);

        rootDirectory.remove(subDirectory);

        rootDirectory.display();
    }
}
