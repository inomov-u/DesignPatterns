## Composite Pattern 

### Overview

Composite Design Pattern is ideal for representing part-whole hierarchies. This program is a file system structure consisting of both files and directories.

**`DirectoryItem`** class that acts as a composite in this file system. This class is able to contain and manage **`FileSystemItem`** objects, which can be either files (**`FileItem`**) or other directories (**`DirectoryItem`**).


**DirectoryItem**:
  - The **`DirectoryItem`** class implements the **`FileSystemItem`** interface.
  - It has methods to add (**`add`**), remove (**`remove`**), and print (**`print`**) file system items.
  - The **`print`** method displays the structure of the directory, including its files and subdirectories.