package COntrolstate;
import java.util.Scanner;
//Create a program that generates and displays the multiplication table for a given integer up to 20.
class table{
    public static void checktable(int number) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(number+" x "+ i +" = " + (number*i));//8 x 1 = 8
        }
    }
}
public class multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter integer upto 20");
        int number=sc.nextInt();
        table.checktable(number);
    }
}
//What are control statements in Java, and how do they influence the flow of a program?
/*
decision making statements
1.if
2.if-else
3.if-else-if
4.switch
looping stmts
1.for
2.while
3.do -while
jumping stamts
1.break,
2.continue
3.return
 */
//What is a switch statement in Java? Discuss its syntax and when it is preferable to use a switch
//statement instead of multiple if statements.
/*
 Example: Checking days of the week, menu options, or grades.

switch (input) {
    case "A": System.out.println("Option A"); break;
    case "B": System.out.println("Option B"); break;
    case "C": System.out.println("Option C"); break;
    default: System.out.println("Invalid Option");
}

// Equivalent with if-else
if (input.equals("A")) {
    System.out.println("Option A");
} else if (input.equals("B")) {
    System.out.println("Option B");
} else if (input.equals("C")) {
    System.out.println("Option C");
} else {
    System.out.println("Invalid Option");
}

 */