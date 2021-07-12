package com.company;

public class Task {

    private String name;
    private int id;
    private String status;
    boolean done;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
        if(done){
            status = "Done";
        }
        else
            status = "Unfinished";
    }



}
