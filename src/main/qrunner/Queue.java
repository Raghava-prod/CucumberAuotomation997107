package main.qrunner;
import test.qtest.queuerunner;

import java.util.ArrayList;
import java.util.List;


public class Queue {

    int queue[] = new int[5];
    String q[] =new String[6];
    int size;
    int front;
    int rear;
    String a;

    public  void enQueue(int data){


        queue[rear] = data;
        rear = rear+1;
        size = size+1;
    }
    public void show(){

        System.out.println("Ele :");
        for(int i=0;i<size;i++){
            System.out.println(queue[i]+"");
        }
    }

}
