## Proxy Design Pattern 

### Overview

**`SecureDocumentProxy`** controls access to confidential documents. The proxy determines if a user has the necessary permissions to view the document content.

A **`SecureDocumentProxy`** class manages access to the **`ConfidentialDocument`** based on user roles.
  - The **`SecureDocumentProxy`** class implements the **`Document`** interface.
  - The proxy controls access to **`ConfidentialDocument`**'s **`displayContent`** method based on a user role.
  - Users with the role "Authorized" are allowed to view the document, while others should receive an access denied message.