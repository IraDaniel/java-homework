package test.java.task6;

import com.company.task6.Notebook;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ira on 02.12.2015.
 */
public class NotebookTest {

    @Test
    public void testNotebook()throws Exception{
        Notebook notebook = new Notebook(10);
        assertTrue("Error", notebook.addNote("First note"));
        assertTrue("Error", notebook.addNote("Second note"));
        assertTrue("Error", notebook.addNote("3"));
        assertTrue("Error", notebook.addNote("4"));
        notebook.showAllNotes();
        assertTrue("Error", notebook.deleteNote(1));
        assertTrue("Error", notebook.deleteNote(0));
        notebook.showAllNotes();
       // assertFalse("Error", notebook.deleteNote(4));
    }
}
