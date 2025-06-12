package codetantra;
//what happens if you try to compare two different data types using relational operators in java, like
//comparing an int with a float? how does java handle such cases?
/*
public class CompareTwoDiffDatatypes {
    public static void main(String[] args) {
        int a=78;
        float b=78.01f;
       System.out.println(a==b);
       //When you compare an int with a float, Java will automatically perform a type promotion to convert the int to a float.
        // In this case, a (which is an int) is converted to 4.0f before the comparison.
    }
}
 */
//what are compound assignment operators in java, and how do they differ from simple
//assignment? discuss the effects of type promotion with these operators.
class CompoundAssignment {
    public static void main(String[] args) {
        int a=78;
        float b=78.01f;
        int res=a+=b;//assignment operators//int=int+float//int=(int)((float)int+float)internally -loss of precision
        System.out.println(res);


    }
}