import java.util.*;

public class MainSet {
    public static void main(String[] args) {
        
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        setA.add(10);
        setA.add(70);
        setA.add(20);
        setA.add(50);
        setA.add(30);
        // setA.remove(10);
        // setA.remove(20);
        //setA.removeAll(setA);
        
        //System.out.println(setA.contains(50));

        //System.out.println(setA);
        // System.out.println(setA.size());
        // System.out.println(setA.isEmpty());



        setB.add(80);
        setB.add(60);
        setB.add(90);
        setB.add(100);
        setB.add(10);

        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        
        System.out.println();
    }
}
