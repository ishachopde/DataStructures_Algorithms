// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//dfs graph traversal
import java.util.*;

class HelloWorld {
    public static HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
    
    public static List<Integer> connections(HashMap<Integer, ArrayList<Integer>> graph){
        List<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        for(int key : graph.keySet()){
            helper(key, result, visited);
        }
        return result;
    }
    
    public static void helper(int vertex, List<Integer> result, Set<Integer> visited){
        Integer currNode = vertex;
       
        
        List<Integer> neighbors = graph.get(currNode);
        for(Integer neighbor : neighbors){
            if(!visited.contains(currNode)){
                visited.add(currNode);
                result.add(currNode);
                helper(neighbor, result, visited);
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        graph.put(0, list);
        list.add(0);
        list.add(2);
        graph.put(1, list);
        list.add(3);
        list.add(1);
        graph.put(2, list);
        list.add(2);
        list.add(0);
        graph.put(3, list);
        System.out.println("Hello, World!");
        List<Integer> output = connections(graph);
        for(Integer op : output){
            System.out.println(op);
        }
    }
}
