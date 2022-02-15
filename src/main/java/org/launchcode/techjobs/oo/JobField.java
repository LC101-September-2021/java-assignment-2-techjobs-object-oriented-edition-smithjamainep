package org.launchcode.techjobs.oo;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        this.id = nextId;
        nextId++;

    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return value;
    }
    public JobField(String value) {
        this();
        this.value = value;
    }


}
