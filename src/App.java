
/**
 * Note.java
 * Contain group of notes inside the arraylist.
 * Each note contains, one note class which has the title and the content.
 *
 * @author (Eric S Lee)
 * @version (v0.0)
 */

import java.util.ArrayList; // import the ArrayList class

public class App
{
    // instance variables
    private int x;                      // Generate ID (Key) of the code
    private ArrayList<Note> theNotes;   // Arraylist of the Note class.
    // Note class contains ID, Title, and its Content.

    /**
     * Constructor for objects of class App
     */
    public App()
    {
        // initialise instance variables
        theNotes = new ArrayList<Note>(); // Create new empty ArrayList.
        x = 0;
    }

    // Create a new note inside the ArrayList
    public void addNote(String newTitle, String newContent) {
        // Note Test = new Note(123,"ABC","ABC");
        theNotes.add(new Note(x, newTitle, newContent));
        x = x + 1; // Used for generate key, once added, add one from x.
    }

    // Delete-Remove a specific note inside the ArrayList
    // Based on the key (order) value
    public void deleteNote(int key) {
        theNotes.remove(key);
    }

    // Edit a specific note (except for ID/Key) inside the ArrayList
    // Based n the key (order) value
    public void editNote(int key, String newTitle, String newContent) {
        Note item = theNotes.get(key);
        item.editNoteTitle(newTitle);
        item.editNoteContent(newContent);
    }

    // Return total number of Note inside the ArrayList
    public int totalLength() {
        return theNotes.size();
    }

    // Return the Key/ID of the Note inside the ArrayList
    public int viewID(int key) {
        Note item = theNotes.get(key);
        return item.returnID();
    }

    // Return the Key/ID of the Note inside the ArrayList
    public int viewKey(int id) {
        int newKey = 0;
        for (int i = 0; i < theNotes.size(); i++)
        {
            Note item = theNotes.get(i);
            if (id == item.returnID()) {
                newKey = id;
                break;
            }
        }
        return newKey;
    }

    // Return the content (ID, Title, Content) of the Note inside the ArrayList
    public String [] viewNote(int key) {
        Note item = theNotes.get(key);
        String[] newItem = {String.valueOf(item.returnID()), item.returnTitle(), item.returnContent()};
        return newItem;
    }
}
