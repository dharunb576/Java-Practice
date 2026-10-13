import java.util.*;

class listGrap{

    //int ver;
    ArrayList<ArrayList<Integer>> s1 = new ArrayList<>();
    listGrap(int v){
        s1 = new ArrayList<>(v);
        for(int i = 1; i <= v; i++){
            s1.add(new ArrayList<Integer>());
        }
    }

    void insert(int a, int b){
        s1.get(a).add(b);
        s1.get(b).add(a);
    }

    void display(){
       for(ArrayList<Integer> innerArray : s1 ){
            for(Integer num : innerArray){
                System.out.print(num+" ");
            }
            System.out.println();
       }
       System.out.println();
    }

    // void dfs(int start){
    //     visit[start] = true;
    //     System.out.println(start+" ");
    //     for(inr num : s1.get(start)){
    //         if(visit(val)){
    //             dfs(val);
    //         }
    //     }
    // }


    public static void main(String[] args) {
        
        listGrap ob = new listGrap(5);

        ob.insert(0,1);
        ob.insert(1,2);
        ob.insert(2,3);
        ob.insert(3,4);
        ob.insert(4,0);
        //ob.insert(1,2);
        //ob.insert(2,1);

        ob.display();
    }
}