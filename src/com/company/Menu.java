package com.company;

public class Menu {

    void mainScreen(){
        System.out.println("//////////////////////");
        System.out.println("WELCOME TO TODOLIST");
        System.out.println("//////////////////////");
        System.out.println("Pick operation:");
        System.out.printf("| View list(1) |  Add new task(2) | exit(3) |");
    }

    void viewList(){
        System.out.println("//////////////////////");
        System.out.println("HERE ARE YOUR TASKS: ");
        System.out.println("//////////////////////");
        System.out.println("Pick operation:");
        System.out.println("| Back to menu(1) | change status(2) |");
    }

    void addTask(){
        System.out.println("//////////////////////");
        System.out.println("ENTER YOUR TASK:");
        System.out.println("//////////////////////");
        System.out.println("Pick operation:");
        System.out.println("| Add another one(1) | Finish(2) |");
    }

    void finish(){
        System.out.println("Finish");
    }

    void error(){
        System.out.println("Its an error!");
    }

    void taskAdd(){
        System.out.println("do you want to add more?");
        System.out.println("| yes(1) | no(2) |");
    }
}
