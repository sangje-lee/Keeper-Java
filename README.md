Keeper App

Series of note with title and contents inside

Instruction,
Main.java ==> Main Java Application
App.java ==> Contain functionality app along with group of Note. (from Note.java)
Note.java ==> Contain information related to the key, title of the note, and content of the Note.

How to use it?
Execute Main.java,
1. Add ==> Add brand new note
2. Edit ==> Edit the content of the note
3. Remove ==> Remove specific note from the list
4. View ==> List all of the note inside the list
5. Exit ==> Stop execute the program

App.java,
private int x; ==> integer of generated ID/Key
private ArrayList<Note> theNotes; ==> List of the notes

public void addNote(String newTitle, String newContent)
==> Create a new Note inside the List
==> newTitle = Name of title in new note
==> newContent ==> Summary of the content in new note

public void deleteNote(int key)
==> Delete a specific Note from the List
==> key = ID/Key note to delete

public void editNote(int key, String newTitle, String newContent)
==> Edit a specific Note from the list
==> key = ID/Key note to edit
==> newTitle = Name of the new title
==> newContent = Name of the new Content

public int totalLength()
==> Return the number of the Notes contain inside the list

public int viewID(int Key)
==> Return specific ID inside the list

public int viewKey(int id)
==> Return specific order inside the list

public String [] viewNote(int Key)
==> Return the content inside the specific Notes
==> Return in String array, where [ID/Key, Title, and Content], all in String forms
==> Key = ID which requests specific note to return

Note.java

private String theTitle ==> Title of note
private String theContent ==> Content of note
private int theID ==> Key (ID) of note

public void editNoteTitle(String newTitle)
==> Editing the title of the note
==> newTitle = Name of new Title

public void editNoteContent(String newContent)
==> Editing the content of the note
==> newContent = Name of new Content

public String returnTitle()
==> Return the title of the note in String form

public String returnContent()
==> Return the content of the note in String form

public int returnID()
==> Return the ID (Key) of the note in Integer
