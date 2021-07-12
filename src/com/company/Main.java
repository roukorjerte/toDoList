package com.company;
import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mainNum, listNum, tasksNum, anotherTaskNum;
        Menu main = new Menu();


        do {
            main.mainScreen();

            Scanner input = new Scanner(System.in);
            mainNum = input.nextInt();

            if (mainNum > 3){
                main.error();
            }

            switch (mainNum) {
                case 1:
                    main.viewList();

                    listNum = input.nextInt();

                    if (listNum > 2) {
                        main.error();
                    }

                    do{
                        System.out.println("Status changed");
                        break;
                    }while (listNum == 2);

                    break;

                case 2:
                    main.addTask();

                    tasksNum = input.nextInt();

                    if (tasksNum > 2) {
                        main.error();
                    }

                    do{
                        main.taskAdd();

                        anotherTaskNum = input.nextInt();

                        if (anotherTaskNum > 2) {
                            main.error();
                        }

                    }while (tasksNum == 2 || anotherTaskNum != 2 );
                    break;
            }

        }while (mainNum != 3);

        main.finish();

    }
}
