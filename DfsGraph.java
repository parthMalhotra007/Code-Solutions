import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DfsGraph {

    static class Graph
    {
        private int vertices;
        private ArrayList<ArrayList<Integer>> adjacencyList;

        Graph(int v)  //constructor
        {
            vertices = v;
            adjacencyList= new ArrayList<>();
            for(int i=0;i<v;i++)
            {
                adjacencyList.add(new ArrayList<>());
            }
        }

        void addEdge(int v, int w)
        {
            adjacencyList.get(v).add(w);
        }

        void dfsUtil(int v, boolean[] visited) //utility function
        {
            visited[v]=true;
            System.out.print(v + " ");

            for (Integer i : adjacencyList.get(v))
            {
                if(!visited[i]) {
                    dfsUtil(i, visited);
                }
            }
        }

        void DFS(int v)
        {
            boolean [] visited = new boolean[vertices];
            dfsUtil(v,visited);
        }

    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("DFS traversal starting from vertex 2:");
        graph.DFS(2);
    }
}
