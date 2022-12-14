package Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhoneNumber {
    public static void main(String[] args) {
     String digits = "23";

     var combination = new LetterCombinationOfPhoneNumber();
     var result= combination.letterCombinations(digits);
     System.out.println(result);
    }


    public List<String> letterCombinations(String digits) {
        HashMap<Character, char[]> map = new HashMap<Character, char[]>();
        map.put('2', new char[]{'a','b','c'});
        map.put('3', new char[]{'d','e','f'});
        map.put('4', new char[]{'g','h','i'});
        map.put('5', new char[]{'j','k','l'});
        map.put('6', new char[]{'m','n','o'});
        map.put('7', new char[]{'p','q','r','s'});
        map.put('8', new char[]{'t','u','v'});
        map.put('9', new char[]{'w','x','y','z'});
        List<String> res = new ArrayList<>();
        if(digits.equals(""))return res;
        helper(digits,0,map,new StringBuilder(),res);
        return res;

    }
    public void helper(String digits, int index, Map<Character,char[]> map , StringBuilder sb, List<String>res){
        if(index>=digits.length()){
            res.add(sb.toString());
            return;
        }
        char c = digits.charAt(index);
        char[] arr = map.get(c);
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
            helper(digits,index+1,map,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
