package com.exercise;

public class FileItem implements FileSystemItem{
    private String name;

    public FileItem(String name){
        this.name = name;
    }
    
    @Override
    public void print(String structure){
        System.out.print(structure + name + "\n");
    }
}
