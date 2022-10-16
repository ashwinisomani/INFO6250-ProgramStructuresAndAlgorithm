package Backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllPathFromSourceToTarget {
    public static void main(String[] args) {
    int[][] graph = {{1,2},{3},{3},{}};

    var path = new AllPathFromSourceToTarget();
    var result = path.allPathsSourceTarget(graph);
    System.out.println(result);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);

        helper(graph, 0, graph.length - 1, res, list);
        return res;
    }

    private void helper(int[][] graph, int source, int target,
        List<List<Integer>> res, LinkedList<Integer> list){
        if (source == target) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int neighbour: graph[source]) {
            list.add(neighbour);
            helper(graph, neighbour, target, res, list);
            list.removeLast();
        }
    }

}

