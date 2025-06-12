package codetantra;

import java.util.Scanner;

//Write a java program that asks for a user’s password input and checks if it matches a pre-defined
//password. if the password is correct, print "access granted", otherwise print "access denied" using if
//else.
public class passwordChecking {
    public static void main(String[] args) {
      String password="Devadatta@017";
      Scanner sc=new Scanner(System.in);
      System.out.println("enter password");
      String enterpass=sc.next();
      if(password.equals(enterpass))
          System.out.println("access granted");
      else
          System.out.println("access denied");


    }
}
