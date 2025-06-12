package CollectionQueue;
import java.util.PriorityQueue;
//lowest element has highest priority
public class priorityqueueExamp {
    public static void main(String[] args) {
        PriorityQueue<Integer> p= new PriorityQueue<Integer>();
        p.add(12);
        p.add(67);
        p.add(8);
        p.add(0);
        //p.clear();

//       while(p.size()>0) {
//           System.out.println(p.poll());
//       }
        System.out.println(p.poll());
        System.out.println(p.remove());
        System.out.println(p.contains(8));
        System.out.println(p.isEmpty());
    }
}
