import java.util.*;

public class ShortestPathUnweightedGraph {
    static class Graph {
        int vertices;
        ArrayList<ArrayList<Integer>> adjacencyList ;


        Graph(int v)
        {
            vertices=v;
            adjacencyList = new ArrayList<>();
            for (int i=0;i<v;i++)
            {
                adjacencyList.add(new ArrayList<>());
            }
        }

        void addEdge(int v, int w)
        {
            adjacencyList.get(v).add(w);
            adjacencyList.get(w).add(v);
        }

        List<Integer> shortestPath(int start , int end)
        {
            Queue<Integer> queue = new LinkedList<>();
            boolean [] visited = new boolean[vertices];
            //int [] distance = new int[vertices];
            int [] parent = new int[vertices];
            Arrays.fill(parent, -1);

            queue.add(start);
            visited[start] = true;

            while(!queue.isEmpty())
            {
                int current = queue.poll();

                for(int neighbour : adjacencyList.get(current))
                {
                    if (!visited[neighbour])
                    {
                        visited[neighbour] = true;
                        queue.add(neighbour);
                        parent[neighbour] = current;
                       // distance[neighbour] = distance[current] + 1; //initially 0  , distance from current node , since unweighted same distance cost In the context of an unweighted graph and the provided code, the distance array is used to represent the shortest number of edges from the start node to each node. The initial value of distance[current] for the start node (current) is set to 0, and it remains 0 throughout the BFS traversal because each edge has the same weight (1 in this case).
                    }
                }

            }
            return reconstructPath(start, end, parent);

        }

        private List<Integer> reconstructPath(int start, int end, int[] parent) {
            List<Integer> path = new ArrayList<>();
            int current = end;

            while (current != -1)
            {
                path.add(current);
                current = parent[current];
            }

            Collections.reverse(path);

            if(path.get(0) == start)
            {
                return path;
            }

            return Collections.emptyList();

        }

        public static void main(String[] args) {
            Graph graph = new Graph(8);
//            graph.addEdge(0, 1);
//            graph.addEdge(0, 2);
//            graph.addEdge(1, 3);
//            graph.addEdge(2, 4);
//            graph.addEdge(3, 5);
//            graph.addEdge(4, 5);
//            graph.addEdge(5, 6);


            // core logic : The logic behind finding the shortest distance in the provided code is based on Breadth-First Search (BFS) traversal. BFS is an algorithm that explores a graph level by level, starting from a given source vertex. In the context of finding the shortest path in an unweighted graph:
            //
            //Initialization:
            //
            //A queue is used to keep track of the nodes to be visited. Initially, the source node is enqueued, and its visited flag is set to true.
            //The parent array is initialized to keep track of the parent node for each visited node. This array helps reconstruct the shortest path later.
            //BFS Traversal:
            //
            //While the queue is not empty, the algorithm dequeues a node, explores its neighbors, and enqueues those neighbors that haven't been visited yet.
            //During this traversal, the parent array is updated to record the parent of each visited node. This information is crucial for reconstructing the shortest path later.
            //Reconstruction of Shortest Path:
            //
            //Once the BFS traversal is complete, the parent array holds the necessary information to reconstruct the shortest path from the source node to any other node in the graph.
            //The reconstructPath method takes the start node, end node, and the parent array as input and reconstructs the path by backtracking from the end node to the start node.
            //Output:
            //
            //The output of the program is the shortest path from the specified start node to the specified end node.
            //The key idea is that BFS explores nodes level by level, ensuring that the first time a node is reached, it is reached via the shortest path. The parent array keeps track of the preceding node on the shortest path from the source to each node. By backtracking from the end node to the start node using the parent array, we can reconstruct the shortest path.


            graph.addEdge( 0, 1);
            graph.addEdge( 0, 3);
            graph.addEdge( 1, 2);
            graph.addEdge( 3, 4);
            graph.addEdge( 3, 7);
            graph.addEdge( 4, 5);
            graph.addEdge( 4, 6);
            graph.addEdge( 4, 7);
            graph.addEdge( 5, 6);
            graph.addEdge( 6, 7);

            int start = 0;
            int end = 7;

            List<Integer> shortestPath = graph.shortestPath(start, end);

            if (!shortestPath.isEmpty()) {
                System.out.println("Shortest Path from " + start + " to " + end + ": " + shortestPath);
            } else {
                System.out.println("No path found from " + start + " to " + end);
            }
        }

    }
}
