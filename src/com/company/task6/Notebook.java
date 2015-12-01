package com.company.task6;

/**
 * Created by Ira on 01.12.2015.
 */

public class Notebook {

    private Note []notes;
    private int index;      // индекс последней записи


    public Notebook(int num) {
        notes = new Note[num];
    }

    public int addNote(String newNote){
        this.notes[index] = new Note(index);
        this.notes[index].setNote(newNote);
        index++;
        return 1;
    }

    public void showAllNotes(){
        for( int i = 0; i < index; i++){
            if(notes[i].getId() == -1){
                continue;
            }
            System.out.println(notes[i].getNote());
        }



    }
    public void deleteNote(int id){
        this.notes[id].setNote("");
        this.notes[id].setId(-1);


    }
    public int changeNote(int id, String newStr){
        this.notes[id].setNote(newStr);
        return 1;
    }

}
