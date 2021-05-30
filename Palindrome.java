import java.util.*; 
import java.io.*;

class Palindrome {

  public static boolean StringChallenge(String str) {
    // code goes here  
    str = str.replaceAll(" ", "");
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
        return true;
      }
    }
    return false;
  }

  public static void main (String[] args) {  
    System.put.println(St)
  }

}