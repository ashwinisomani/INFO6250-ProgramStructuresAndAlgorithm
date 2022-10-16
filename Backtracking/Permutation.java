package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
    int[] nums = {1,2,3};

    var permutation = new Permutation();
    var result= permutation.permute(nums);
    System.out.println(result);
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result,nums,new ArrayList<>());
        return result;
    }

    private void helper(List<List<Integer>> result , int[] nums , ArrayList<Integer> temp){
        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp)) ;
            return;
        }
        for(int i = 0; i < nums.length;i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            helper(result, nums, temp);
            temp.remove(temp.size()-1);
        }
    }
}
