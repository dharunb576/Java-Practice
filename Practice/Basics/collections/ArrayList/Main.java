import java.util.*;

public class Main {
    public static void main(String[] args){
        underList();
    }


    static void underList(){
        List<Integer> l1 = new ArrayList<>();


        // -- to check list isEmpty ---
        System.out.println("-------");
        System.out.println(l1.isEmpty());
        
        
        System.out.println("-------");
        l1.add(433);
        l1.add(10);
        l1.add(2);
        l1.add(50);
        l1.add(30);
        l1.add(50);
        System.out.println(l1);

        //----to retrieve the elements by the index----
        System.out.println("-------");
        System.out.println(l1.get(2));

        //-----to set a value by the index-----
        System.out.println("-------");
        l1.set(1, 100);
        System.out.println(l1.get(1));
        System.out.println(l1);

        System.out.println(l1.contains(100));

        //--- to remove value by index---
        System.out.println("-------");
        l1.remove(1);
        System.out.println(l1);

        // -- remove by pointing the value ---
        l1.remove(Integer.valueOf(10));

        //-- to return the size of the list---
        System.out.println("-------");
        System.out.println(l1.size());

        // --- to check the element present ---
        System.out.println("-------");
        System.out.println(l1.contains(100));

        // --- to find index of the element ---
        System.out.println("-------");
        System.out.println(l1.indexOf(5));
        System.out.println(l1);

        // -- if the element is more than 1 time, to find the last occurance
        System.out.println(l1.lastIndexOf(50));


        //-- to clear out all elements in the list
        System.out.println("-------");
        // l1.clear();
        System.out.println(l1);


        ArrayList <Integer> l2 = new ArrayList<>();
        // --- the List in more general and ArrayList is specific
        // --- the List ---> car and ArrayList ----> tesla car
        // --- it have two more extra fuctions

        l2.add(10);
        l2.add(20);
        l2.add(300);
        l2.add(600);
        l2.add(50);
        System.out.println("--- New Array List ---");
        System.out.println(l2);

        
        // --- to sort the List 
        System.out.println("------");
        Collections.sort(l2);
        System.out.println(l2);

        System.out.println("------");
        // System.out.println(l2.ensureCapacity(1));

        // -- to reverse the list --
        Collections.reverse(l1);
        System.out.println(l1);
    }
}
