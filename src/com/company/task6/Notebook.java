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

    /**
     * ������� ������� ������ � ��������
     * @param id ����� ������, ������� ����� �������
     */
    public boolean deleteNote(int id){
        if(id > index){
            return false;
        }else{
            this.notes[id].setNote("");
            this.notes[id].setId(-1);
            return true;
        }



        /*for( int i = 0; i < index ;i++){
            if(i == id){

            }
        }*/
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
