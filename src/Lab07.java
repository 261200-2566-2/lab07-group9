import java.util.Collection;

public class Lab07 {
    public static void main(String[] args) {
        Set<Integer> s = new Set<>();
        Set<Integer> s2 = new Set<>();


        //test add true
        System.out.println(s.add(1));
        //test add false (already in set)
        //System.out.println(s.add(1));

        s2.add(1);
        s2.add(2);
        s2.add(3);

        //test addAll and contains
        //s.addAll(s2);
        //System.out.println(s.contains(3));

        //test clear
        //s.clear();

        //test size
        //System.out.println(s.size());

        //test containAll
        //System.out.println(s.containsAll(s2));
        //System.out.println(s2.containsAll(s));

        //test isEmpty
        //System.out.println(s.isEmpty());

        //test remove
//        Set<Integer> s3 = new Set<>();
//        s3.add(1);
//        s3.add(2);
//        System.out.println(s3.remove(2));
//        System.out.println(s3.contains(2));

        //test removeall
//        System.out.println(s2.size());
//        System.out.println(s2.removeAll(s));
//        System.out.println(s2.size());
//        System.out.println(s2.contains(1));


        //test retainAll
//        System.out.println(s2.size());
//        System.out.println(s2.retainAll(s));
//        System.out.println(s2.size());
//        System.out.println(s2.contains(3));
//        System.out.println(s2.contains(1));
    }
}
