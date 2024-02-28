package com.proxy;

public class SecureDocumentProxy implements Document{
    private ConfidentialDocument confidentialDocument;
    private String userRole; // Role of the user trying to access the document

    public SecureDocumentProxy(String content, String userRole) {
        this.confidentialDocument = new ConfidentialDocument(content);
        this.userRole = userRole;
    }

    @Override
    public void displayContent() {
        // access control
        // If userRole is "Authorized", display the document content.
        // Otherwise, print "Access Denied".
        
        if(userRole == "Authorized")
        {
            confidentialDocument.displayContent();
        } else {
            System.out.print("Access Denied: You do not have permission to view this document.\n");
        }
    }


}
