import java.util.Collection;

public class Lab07 {
    public static void main(String[] args) {
        Set<Integer> s = new Set<>();
        Set<Integer> s2 = new Set<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);


        s2.add(3);
        s2.add(4);



        //s2.addAll(s);

        //s.remove(1);
       // System.out.println(s.contains(6));
        System.out.println(s.size());
        s.retainAll(s2);
        System.out.println(s.contains(1));
        System.out.println(s.size());
    }
}
