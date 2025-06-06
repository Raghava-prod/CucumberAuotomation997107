package test.Automation;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {

    WebDriver driver;
    public static void main(String[] args){

    }


    String parent = driver.getWindowHandle();

    Set<String> s = driver.getWindowHandles();

  public void windowhandle (){
      for(String handle: s){
          if(!handle.equalsIgnoreCase(parent)){
              driver.switchTo().window(handle);
          }
      }
  }

  Iterator<String> I1= s.iterator();

public void windowhandle1(){

    while(I1.hasNext()){
        String child_window= I1.next();
        if(!child_window.equals(parent)){
            driver.switchTo().window(child_window);
        }
    }
}




}