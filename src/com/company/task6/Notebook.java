package com.company.task6;

/**
 * Created by Ira on 01.12.2015.
 */

/**  ласс ƒневник
 *  —одержит записи дневника
 */
public class Notebook {

    private Note []notes;
    private int index;      // индекс последней записи
    private int maxSize;

    /**
     *
     * @param num количество записей в дневнике
     */
    public Notebook(int num) {
        maxSize = num;
        notes = new Note[num];
    }

    /**
     * ƒобавление новой записи в блокнот
     * @param newNote —трока новой записи
     * @return true/false в зависимости от результата добавлени€
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
     * ѕосмотреть все записи
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
     * ‘ункци€ удал€ет запись в дневнике
     * @param id номер записи, который хотим удалить
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
     * @param id номер записи, которую хотим редактировать
     * @param newStr нова€ запись
     * @return
     */
    public int changeNote(int id, String newStr){
        this.notes[id].setNote(newStr);
        return 1;
    }

}
