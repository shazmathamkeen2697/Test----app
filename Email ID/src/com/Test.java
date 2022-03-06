package com;
import java.util.*; 
class Test { 
    public static void main(String[] args) 
    { 
      String[] strArray = { "shazzu@gmail.com", "amrin@gmail.com", "karimulla@gmail.com", "mobina@gmail.com", "disha@gmail.com" };
        boolean found = false;
        
        String searchStr = "shazzu@gmail.com";
       for (int i = 0; i <strArray.length; i++) {
       if(searchStr.equals(strArray[i])) {
           found = true; 
            break;
            }
        }
       if(found)
          System.out.println(searchStr + "\n"+ "found ");
        else
          System.out.println(searchStr +" not found in the array");
 
    }
}

