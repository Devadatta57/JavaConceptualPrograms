package codetantra;

import java.util.Scanner;

//Write a program that checks if a given character is a vowel or consonant using if-else statements.
//ensure the program handles both uppercase and lowercase characters.
public class VowelsOrConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter character");
        char ch=sc.next().charAt(0);
        if(ch=='A' ||ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            System.out.println(ch+" is a vowel");
        else
            System.out.println(ch+" is a consonant");

    }
}
