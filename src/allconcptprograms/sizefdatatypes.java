package allconcptprograms;

public class sizefdatatypes {

    public static void main(String[] args) {
/*
        System.out.println(Byte.SIZE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println();

        System.out.println(Short.SIZE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println();

        System.out.println(Integer.SIZE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println();

        System.out.println(Long.SIZE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println(Character.SIZE);

 */

        /*
       int a=10;
       int b=20;
       float c=a+b;
       System.out.println(c);

       int d=10;
       float e=10.5f;
       float f=d+e;
       System.out.println(f);


        double a=3.4;
        byte b=(byte)a;//lossy
        System.out.println(b);

        int i=10;
        int j=45;
        int f=i++;//11
        System.out.println(f);
        System.out.println(i);
        j++;
        System.out.println(j);

  int i=10;
  switch(i+1){
      case 10:
          System.out.println(10);
          break;
      case 11:
          System.out.println(11);
          break;
      case 12:
          System.out.println(12);
          break;
      default:
          System.out.println("default");
  }


      int i=10;
      int k=34;
      final int CONSTANT=44;
      switch(i+k){
          case 10://case label cant be variable
              System.out.println(10);
              break;
          case 34:
              System.out.println(34);
              break;
          case CONSTANT:
              System.out.println("constant "+CONSTANT);
              break;
          default:
              System.out.println("default");
      }

         */
        // int a=23;
        // int b=3;

        /*
        if(a++>b && b++<a){//24>3 && 4<23//true && true=true
          System.out.println("logical  AND operator "+a +" "+b);
        }
        if(a++<b && b++<a){//24<3 && 4<23//false && true
            System.out.println("logical  OR"+a+" "+b);
        }
        System.out.println(a+" "+b);
         */

        /*
        int a=23;
        int b=3;
        if(a++>b || b++<a){//24>3 && 4<23//true or false
            System.out.println("logical OR operator "+a +" "+b);
        }
        if(a++<b || b++>a){//24<3 && 4<23//false or true
            System.out.println("logical operator "+a +" "+b);
        }
        System.out.println(a+" "+b);
         */

        int a=23;
        int b=3;
        //  if(a++>b & b++<a){//24>3 && 4<23//true && true=true
        //    System.out.println("logical  AND operator "+a +" "+b);
        // }
        // if(a++<b &  b++<a){//24<3 && 4<23//false && true
        //    System.out.println("logical  OR"+a+" "+b);
        // }
        //System.out.println(a+" "+b);
        /*
        if(a++<b | b++<a){//24<3 && 4<23//false && true
            System.out.println("logical  OR"+a+" "+b);
        }
        System.out.println(a+" "+b);

         */
        if(a++<b | b++>a){//24<3 && 4<23//false && true
            System.out.println("logical  OR"+a+" "+b);
        }
        System.out.println(a+" "+b);

    }
}