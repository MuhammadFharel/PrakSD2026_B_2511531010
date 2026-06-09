package pekan9_2511531010;

import java.util.*;
public class GraphTraversal_2511531010 {
	private Map<String, List<String>> graph_1010 = new HashMap<>();

    // Menambahkan edge (graf tak berarah)
    public void addEdge(String node1_1010, String node2_1010) {
        graph_1010.putIfAbsent(node1_1010, new ArrayList<>());
        graph_1010.putIfAbsent(node2_1010, new ArrayList<>());
        graph_1010.get(node1_1010).add(node2_1010);
        graph_1010.get(node2_1010).add(node1_1010);
    }

    // Menampilkan graf awal
    public void printGraph() {
        System.out.println("Graf Awal (Adjacency List):");
        for (String node_1010 : graph_1010.keySet()) {
            System.out.print(node_1010 + " -> ");
            List<String> neighbors_1010 = graph_1010.get(node_1010);
            System.out.println(String.join(", ", neighbors_1010));
        }
        System.out.println();
    }

    // DFS rekursif
    public void dfs(String start) {
        Set<String> visited_1010 = new HashSet<>();
        System.out.println("Penelusuran DFS:");
        dfsHelper(start, visited_1010);
        System.out.println();
    }

    private void dfsHelper(String current_1010, Set<String> visited_1010) {
        if (visited_1010.contains(current_1010))
            return;

        visited_1010.add(current_1010);
        System.out.print(current_1010 + " ");

        for (String neighbor_1010 : graph_1010.getOrDefault(current_1010, new ArrayList<>())) {
            dfsHelper(neighbor_1010, visited_1010);
        }
    }

    // BFS iteratif
    public void bfs(String start) {
        Set<String> visited_1010 = new HashSet<>();
        Queue<String> queue_1010 = new LinkedList<>();

        queue_1010.add(start);
        visited_1010.add(start);

        System.out.println("Penelusuran BFS:");

        while (!queue_1010.isEmpty()) {
            String current_1010 = queue_1010.poll();
            System.out.print(current_1010 + " ");

            for (String neighbor_1010 : graph_1010.getOrDefault(current_1010, new ArrayList<>())) {
                if (!visited_1010.contains(neighbor_1010)) {
                    queue_1010.add(neighbor_1010);
                    visited_1010.add(neighbor_1010);
                }
            }
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        GraphTraversal_2511531010 graph_1010 = new GraphTraversal_2511531010();

        // Contoh graf: A-B, A-C, B-D, B-E
        graph_1010.addEdge("A", "B");
        graph_1010.addEdge("A", "C");
        graph_1010.addEdge("B", "D");
        graph_1010.addEdge("B", "E");

        // Cetak graf awal
        System.out.println("Garf Awal adalah: ");
        graph_1010.printGraph();

        // Lakukan penelusuran
        graph_1010.dfs("A");
        graph_1010.bfs("A");
    }
}