import java.util.ArrayList;
import java.util.List;

public class CycleInGraph {

    static class Graph {
        int vertices;
        ArrayList<ArrayList<Integer>> adjacentList;

        public Graph(int v) {
            this.vertices = v;
            adjacentList = new ArrayList<>();
            for (int i=0;i<v;i++)
            {
                adjacentList.add(new ArrayList<>());

            }
        }

        void addEdge(int v , int w)
        {
            adjacentList.get(v).add(w);
        }

        boolean hasCycle() {
            boolean[] visited = new boolean[vertices];
            boolean[] recursionStack = new boolean[vertices];

            for (int i = 0; i < vertices; i++) {
                if (DfsCycle(i, visited, recursionStack)) {
                    return true;
                }
            }
            return false;
        }

        boolean DfsCycle(int v, boolean[] visited, boolean[] recursionStack) {
            if (recursionStack[v]) {
                return true; // Cycle detected due to presence in recursion stack
            }

            if (visited[v]) {
                return false; // Already visited node
            }

            visited[v] = true;
            recursionStack[v] = true;

            for (int i : adjacentList.get(v)) {
                if (DfsCycle(i, visited, recursionStack)) {
                    return true;
                }
            }

            recursionStack[v] = false; // Backtrack: remove from recursion stack
            return false;
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

        if (graph.hasCycle()) {
            System.out.println("Graph contains a cycle");
        } else {
            System.out.println("Graph doesn't contain a cycle");
        }
    }


    }

