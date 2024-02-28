package com.proxy;

public class ConfidentialDocument implements Document{
    private String content;

    public ConfidentialDocument(String content) {
        this.content = content;
        loadDocumentFromDisk();
    }

    private void loadDocumentFromDisk(){
        System.out.print("Loading confidential document from disk...");
        System.out.println("Done");
    }

    @Override
    public void displayContent() {
        System.out.print(content + "\n");
    }

}
