package com.exercise;

import java.util.ArrayList;
import java.util.List;

public class DirectoryItem implements FileSystemItem {
    private List<FileSystemItem> children = new ArrayList<>();
    private String name;

    public DirectoryItem(String name){
        this.name = name;
    }

    public void add(FileSystemItem item){
        // method to add FileSystemItem (file or directory) to the directory
        children.add(item);
    }

    public void remove(FileSystemItem item) {
        // method to remove FileSystemItem (file or directory) from the directory
        children.remove(item);
    }

    @Override
    public void print(String structure) {
        // method to print the directory structure
        System.out.print(structure + name + "\n");
        for(FileSystemItem i : children)
        {
            i.print("  " + structure);
        }
    }

    // Method to support unit testing
    public List<FileSystemItem> getChildren() {
        return children;
    }

}
