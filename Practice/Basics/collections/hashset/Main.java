import java.util.HashSet;

public class Main {
    public static void main(String[]args){
        HashSet<Integer> set = new HashSet<>();

        // -- to add values inside the set --
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(6);
        System.out.println(set);
        // -- we can remove by pointing element value
        set.remove(6);


        // -- to return the true || false according to the presence of that element
        System.out.println((set.contains(3)));
        System.out.println(set);

        // --to return the size of the set--
        System.out.println(set.size());


        // -- to return the set is empty or not --
        System.out.println(set.isEmpty());

        
        
        // -- set traversal --
        for(int a : set){
            System.out.println(a);
        }
        
        // -- to clear all values in the set --
        set.clear();
        System.out.println(set);
    }
}
