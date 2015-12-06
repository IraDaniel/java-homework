package com.company.task6;

/**
 * Created by Ira on 01.12.2015.
 */

/** ����� �������
 *  �������� ������ ��������
 */
public class Notebook {

    private Note []notes;
    private int index;      // ������ ��������� ������
    private int maxSize;

    /**
     *
     * @param num ���������� ������� � ��������
     */
    public Notebook(int num) {
        maxSize = num;
        notes = new Note[num];
    }

    /**
     * ���������� ����� ������ � �������
     * @param newNote ������ ����� ������
     * @return true/false � ����������� �� ���������� ����������
     */
    public boolean addNote(String newNote){

        if(index < maxSize){
            this.notes[index] = new Note(index);
            this.notes[index].setNote(newNote);
            index++;
            return true;
        }
        else{
            return false;
        }

    }

    /**
     * ���������� ��� ������
     */
    public void showAllNotes(){
        for( int i = 0; i < index; i++){
            if(notes[i].getId() == -1){
                continue;
            }
            System.out.println(notes[i].getNote());
        }



    }
    // id ������, ������� �������

    /**
     * ����������� ������� � ����� ������, �������� ������, ������� ����� �������
     * @param id ����� ������, ������� �������
     * @return ����� ������ �������� Note
     */
    private Note[] deleteLastNotes(int id){
        Note [] newNote = new Note[maxSize];
        int iLast = 0;
        int iNew = 0;
        while(iLast < index){
            if(iLast == id){
                iLast++;
                continue;
            }

            newNote[iNew] = new Note(iNew);
            newNote[iNew].setId(notes[iLast].getId());
            newNote[iNew].setNote(notes[iLast].getNote());
            iLast++;
            iNew++;
        }
        index -= 1;
        return newNote;
    }

    /**
     * ������� ������� ������ � ��������
     * @param id ����� ������, ������� ����� �������
     */
    public boolean deleteNote(int id){
        if(id > index){
            return false;
        }else{
            Note [] newNote = deleteLastNotes(id);
            notes = newNote;
           // this.notes[id].setNote("");
           // this.notes[id].setId(-1);
            return true;
        }

    }

    /**
     *
     * @param id ����� ������, ������� ����� �������������
     * @param newStr ����� ������
     * @return
     */
    public int changeNote(int id, String newStr){
        this.notes[id].setNote(newStr);
        return 1;
    }

}
