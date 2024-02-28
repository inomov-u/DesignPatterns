package com.exercise;

public class App {
    public static void main(String[] args) {
        //Example usage
        DirectoryItem root = new DirectoryItem("RootDirectory");//root subdir file2 file1
        root.add(new FileItem("File1.txt"));
        root.add(new FileItem("File2.txt"));

        DirectoryItem subDirectory = new DirectoryItem("SubDirectory");
        subDirectory.add(new FileItem("File3.txt"));

        root.add(subDirectory);

        root.print("");

    }
}
