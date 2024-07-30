
/**
 * Note.java
 * Contain the ID (Key), title and the content of the note.
 *
 * @author (Eric S Lee)
 * @version (v0.0)
 */
public class Note
{
    // instance variables
    private String theTitle;    // Title of note
    private String theContent;  // Content of note
    private int theID;          // Key (ID) of note

    /**
     * Constructor for objects of class Note
     * When created, ID will generated from App.java
     * However, title and content need manual entry from App.java
     */
    public Note(int newID, String newTitle, String newContent)
    {
        // initialise instance variables
        theID = newID;
        theTitle = newTitle;
        theContent = newContent;
        
    }

    // Editing the title of the note
    public void editNoteTitle(String newTitle) {
        theTitle = newTitle;
    }

    // Editing the content of the note
    public void editNoteContent(String newContent) {
        theContent = newContent;
    }

    // Return the title of the note in String form
    public String returnTitle() {
        return theTitle;
    }

    // Return the content of the note in String form
    public String returnContent() {
        return theContent;
    }

    // Return the ID (Key) of the note in Integer
    public int returnID() {
        return theID;
    }
}
