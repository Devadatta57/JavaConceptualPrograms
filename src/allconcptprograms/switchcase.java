package allconcptprograms;

public class switchcase {
    public static void main(String[] args) {
        int i = 89;
        //no fallthrough:becoz cond matched at last case
        /*
        switch(89){
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            case 89:
                System.out.println(89);//there is no fallthrough becoz correct case matchd at last so execution starts from here
           // case 89://duplicate not allowed
          // System.out.println(89);

         */
        //fallthrough:becoz cond matched at 2nd case and from there execution continued through all stmts
        switch (89) {
            case 34:
                System.out.println(2);
            case 89:
                System.out.println(39);
            case 8:
                System.out.println(89);
        }
        //use break:to stop fallthrough
        //switch case(cond)-an variable
        /*
        Primitive Data Types:
        byte
        short
        char
        int
        --------
        Wrapper Classes (introduced in Java 7+):
        Byte
        Short
        Character
        Integer
        --------------
        String
        enumeration
           But not float,double,long objts other than string,enum
         */
        //rules for case labels:
        /*
        Must Be Compile-Time Constants:literals,final var,'A'
        Unique Values:2,4
        Data Type Compatibility:ch='A'>switch(ch)
         */
        final int m = 89;
        switch (m + 1) {//since mis final at compile time it evaluated as constant so no error
            case 'A'://takes-asccii(65)
                System.out.println(2);
                break;
            case 89:
                System.out.println(89);
                break;
            case 7://"u":not allowed when
                System.out.println(8);
                break;
        }
        String name = "govinda";
        switch ("govinda") {
            case "Govinda"://takes-asccii(65)
                System.out.println(2);
                break;
            // case 'A'://when string/var which stored string is paassed as cond char,int not allowed
            case "545":
                System.out.println(89);
                break;
            case "dfer"://"u":not allowed
                System.out.println(8);
                break;
        }
    }
}
