class adjGrap{
    int mat[][];
    int ver;
    adjGrap(int v){
        ver = v;
        mat = new int[ver][ver];
    }

    void addEdge(int a, int b){
        mat[a][b] = 1;
        mat[b][a] = 1;
    }

    void display(){
        for(int i = 0; i < ver; i++){
            for(int j = 0; j < ver; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

}

class graph{
    public static void main(String[] args) {

        adjGrap ob = new adjGrap(5);

        ob.addEdge(1,1);//0,1
        ob.addEdge(2,2);//0,2
        ob.addEdge(3,3);//3,1
        ob.addEdge(4,4);//1,4
        ob.addEdge(0,0);//4,0

        ob.display();
    }
}