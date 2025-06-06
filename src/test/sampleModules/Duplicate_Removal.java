package test.sampleModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Duplicate_Removal {

   public static int[] a= {2,4,6,2,3,3,8,1,2,9,3,9};

    public static List<Integer> b = new ArrayList<>();
    public static List<Integer> duplicate = new ArrayList<>();



    public static void main(String[]  args){
        for(int c: a){

            if(b.contains(c)){
                duplicate.add(c);
            }
            else {
                b.add(c);
            }

        }
        System.out.println(b);
        Collections.sort(b);
        System.out.println(b);



    }


    }

