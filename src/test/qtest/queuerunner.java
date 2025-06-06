package test.qtest;

import main.qrunner.Queue;
import org.testng.annotations.Test;

public class queuerunner {



    public static void main(String[] args){
        Queue q= new Queue();
        q.enQueue(5);
        q.show();
    }


}
