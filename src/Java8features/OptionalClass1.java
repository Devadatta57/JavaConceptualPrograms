package Java8features;
import java.util.Optional;
public class OptionalClass1 {
    public static void main(String[] args) {
        String str[]={"rama",null,"seeta",null,"lakshmana",null,"hanuman"};
//        for(String s:str){
//            if(s!=null) {
//                System.out.println(s + " ");
//            }
//        }
        for(String s:str){
           Optional<String> x=Optional.ofNullable(s);
           //x.ifPresent(y->System.out.println(y+" "));
//x.ifPresentOrElse(y->System.out.println(y+" "),()->{System.out.println("null value found");});
            System.out.println(x.isPresent());
        }
    }
}
