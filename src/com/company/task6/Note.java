package com.company.task6;

/**
 * Created by Ira on 01.12.2015.
 */

/** ����� Note �������� ���������� �� ����� ������
 *
 */
public class Note {

    private String note;
    private int id;


    public Note(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNote() {
        return note;
    }

    /**
     * �������� ������ � �������
     * @param note
     * ������
     */
    public void setNote(String note) {
        this.note = note;
    }
}
