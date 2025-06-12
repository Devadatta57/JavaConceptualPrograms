package Java8features;
import java.util.Optional;
public class OptionalClass {
    public static void main(String[] args) {
        String[] str={"deva",null,"datta",null,"folik",null,"ert","yui"};
        for(String x:str){
//            if(x!=null) {
//                System.out.println(x + " ");
//            }
            Optional<String> s=Optional.ofNullable(x);
           // s.ifPresent(y->System.out.println(y+" "));
            //s.ifPresentOrElse(y->System.out.println(y.toUpperCase()+" "), ()->{System.out.println("null found");});
            System.out.println(s.isPresent());

        }

    }
}
