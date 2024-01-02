import java.util.ArrayList;
import java.util.LinkedList;

public class BfsGraph {

    static class Graph
    {
        private int vertices;
        private ArrayList<ArrayList<Integer>> adjacencyList;

        Graph(int v)
        {
            vertices = v;
            adjacencyList = new ArrayList<>();
            for(int i=0 ; i<v; i++)
            {
                adjacencyList.add(new ArrayList<>());
            }
        }

        void addEdge(int v, int w)
        {
            adjacencyList.get(v).add(w);
        }

        void BFS(int start)
        {
            boolean [] visited = new boolean[vertices];
            LinkedList<Integer> queue = new LinkedList<>();

            visited[start]=true;
            queue.add(start);

            while (!queue.isEmpty())
            {
                start=queue.poll();
                System.out.println(start + "");

                for(int i :adjacencyList.get(start))
                {
                    if(!visited[i])
                    {
                        visited[i]=true;
                        queue.add(i);
                    }
                }


            }

        }
    }

    public static void main(String args[]) {
        Graph graph = new Graph(4);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(3, 3);

        System.out.println("BFS traversal starting from vertex 2:");
        graph.BFS(2);
    }
}
