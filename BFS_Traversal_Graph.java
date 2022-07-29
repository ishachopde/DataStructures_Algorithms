// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//BFS graph traversal
import java.util.*;

class HelloWorld {
    public static HashMap<Integer, List<Integer>> graph = new HashMap<>();
    
    public static List<Integer> connectionsBFS(HashMap<Integer, List<Integer>> graph, int start){
        List<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(start);
        result.add(start);
        visited.add(start);
        while(!queue.isEmpty()){
            Integer currNode = queue.poll();
            List<Integer> neighbors = graph.get(currNode);

            for(Integer neighbor : neighbors){
                if(!visited.contains(neighbor)){
                    queue.add(neighbor);
                    result.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        graph.put(0, list);
         list = new ArrayList<>();
         list.add(1);
        list.add(2);
        graph.put(1, list);
         list = new ArrayList<>();
         list.add(3);
        list.add(0);
        graph.put(2, list);
         list = new ArrayList<>();
         list.add(3);
        // list.add(2);
        graph.put(3, list);
        System.out.println("Hello, World!");
        List<Integer> output = connectionsBFS(graph, 2);
        for(Integer op : output){
            System.out.println(op);
        }
    }
}
