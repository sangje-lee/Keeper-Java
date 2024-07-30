
/**
 * Main.java
 * Executable java code of the code.
 *
 * @author (Eric S Lee)
 * @version (v0.0)
 */

import java.util.Scanner;  // Import the Scanner class

public class Main
{
    public static void main(String [] args) {
        App test = new App(); // Generate new App class which contain note in ArrayList

        boolean itemLoopable = true; // Run the code until user exit the code
        while (itemLoopable)
        {
            System.out.println("Welcome to command version of Things to do");
            System.out.println("1. Add");       // Add a note
            System.out.println("2. Edit");      // Edit a note (Content only)
            System.out.println("3. Remove");    // Remove a note
            System.out.println("4. View");      // View a note
            System.out.println("5. Exit");      // Exit the Code
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            String userChoice = myObj.nextLine();  // Read userChoice in String format
            if (userChoice.equals("5")) { // userChoice is "5" then exit code
                break;
            } else if (userChoice.equals("1")) { // userChoice is "1"
                // Add a note to the ArrayList created
                Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
                System.out.print("Enter the Title: ");
                String userTitle = myObj.nextLine();  // Read userTitle, Title of the new Note
                System.out.print("Enter the content: ");
                String userComment = myObj2.nextLine();  // Read userComment, Content of the new Note
                test.addNote(userTitle, userComment); // Add a new Note to ArrayList
            } else if (userChoice.equals("2")) { // userChoice is "2"
                // Edit the specific note to the ArrayList, based on the key/ID
                if (test.totalLength() == 0) {
                    // If the ArrayList (App class) is empty then
                    // Alert user to add the new note first
                    System.out.println();
                    System.out.println("Enter the data before proceed");
                } else {
                    // If the ArrayList has at least one note then
                    // First display all the notes inside the ArrayList
                    for (int i = 0; i < test.totalLength(); i++) {
                        String[] testItem = test.viewNote(i);
                        System.out.println(i + " " + testItem[1] + " " + testItem[2]);
                    }
                    // Then ask user to which section note to edit
                    Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
                    System.out.print("Enter the number to edit: ");
                    int userColumn = myObj2.nextInt(); // Read userColumn in integer format
                    if (userColumn < test.totalLength() && userColumn >= 0) {
                        // If the proper range (key/ID) is selected then
                        // Display specific key of the note (Content only)
                        String[] testItem = test.viewNote(userColumn);
                        System.out.println(userColumn + " " + testItem[2]);
                        System.out.println();
                        System.out.println("Only the content can be edited");
                        // Ask user to prompt new Content
                        System.out.print("Enter the new content: ");
                        Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
                        String newUserComment = myObj3.nextLine();  // Read newUserComment
                        if (newUserComment.equals("")) {
                            // If user give blank then
                            // Assume the note will not be edited.
                            // newUserComment = testItem[2];
                            System.out.println("No change occurs");
                        } else {
                            // If user state a new Content then
                            // Replace old Content into new Content
                            String[] newNote = test.viewNote(userColumn);
                            test.editNote(userColumn, newNote[1], newUserComment);
                        }
                    } else {
                        // If the proper range (key/ID) is not selected then
                        // Indicate that there's no note contain in that range Key/ID
                        System.out.println();
                        System.out.println("Invalid ID number, try again!");
                    }
                }
            } else if (userChoice.equals("3")) { // userChoice is "3"
                // Delete the specific note to the ArrayList, based on the key/ID
                if (test.totalLength() == 0) {
                    // If the ArrayList (App class) is empty then
                    // Alert user to add the new note first
                    System.out.println();
                    System.out.println("Enter the data before proceed");
                } else {
                    // If the ArrayList has at least one note then
                    // First display all the notes inside the ArrayList
                    for (int i = 0; i < test.totalLength(); i++) {
                        String[] testItem = test.viewNote(i);
                        System.out.println(i + " " + testItem[1] + " " + testItem[2]);
                    }
                    // Then ask user to which section note to remove/delete
                    Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
                    System.out.print("Enter the number to delete: ");
                    int userColumn = myObj2.nextInt(); // Line();  // Read userColumn in Integer
                    if (userColumn < test.totalLength() && userColumn >= 0) {
                        // If the specific note is found then remove specific note from the Arraylist
                        test.deleteNote(userColumn);
                    } else {
                        // If the specific note is not existed then indicate the error
                        // That the specific note is not founded.
                        System.out.println();
                        System.out.println("Invalid ID number, try again!");
                    }
                }
            } else if  (userChoice.equals("4")) { // userChoice is "4"
                // Display all the notes inside the Arraylist
                // The note will display,
                // Location of the Arraylist, Key code, Title, then Content
                for (int i = 0; i < test.totalLength(); i++) {
                    String[] testItem = test.viewNote(i);
                    System.out.println(i + " " + testItem[0] + " " + testItem[1] + " " + testItem[2]);
                }
            } else { // userChoice is other than "0" to "5".
                // Indicate the error.
                System.out.println("Invalid Code, try again.");
            }
            System.out.println();
        }
    }
}
