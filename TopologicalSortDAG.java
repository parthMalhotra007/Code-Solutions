import java.util.*;

public class TopologicalSortDAG {

     static class Graph {
         int vertices;
         ArrayList<ArrayList<Integer>> adjacentList;

         Graph (int v)
         {
             vertices = v;
             adjacentList = new ArrayList<>();
             for (int i=0 ; i<v ; i++)
             {
                 adjacentList.add(new ArrayList<>());
             }
         }

         void addEdge(int v , int w)
         {
             adjacentList.get(v).add(w);
         }

         List<Integer> topologicalSort()
         {
             boolean [] visited = new boolean[vertices];
             Stack<Integer> stack = new Stack<>();

             for (int i = 0; i<vertices ; i++)
             {
                 if(!visited[i])
                 {
                     topologicalSortUtil(visited,stack, i);
                 }
             }

             List<Integer> result = new ArrayList<>();
             while (!stack.isEmpty())
             {
                 result.add(stack.pop());
             }

             return result;
         }

         private void topologicalSortUtil(boolean[] visited, Stack<Integer> stack, int vertex) {
             visited[vertex] = true;

             for(int neighbour : adjacentList.get(vertex))
             {
                 if (!visited[neighbour])
                 {
                     visited[neighbour] = true;
                     topologicalSortUtil(visited,stack,neighbour); //DFS
                 }
             }

             stack.push(vertex);
         }

     }

    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(5, 2);
        graph.addEdge(5, 0);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);

        List<Integer> topologicalOrder = graph.topologicalSort();

        System.out.println("Topological Order: " + topologicalOrder);
    }

}
