package com.proxy;

public class App {

    public static void main(String[] args) {
        Document confidentialDoc = new SecureDocumentProxy("Confidential Content", "Authorized");
        confidentialDoc.displayContent(); // display the content

        Document restrictedDoc = new SecureDocumentProxy("Top Secret Content", "Unauthorized");
        restrictedDoc.displayContent(); // deny access
    }
}
