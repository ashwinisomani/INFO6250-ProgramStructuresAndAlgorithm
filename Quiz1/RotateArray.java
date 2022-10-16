package Quiz1;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7};
    int k = 3;

    var rotate = new RotateArray();
    int[] result = rotate.rotate(nums,k);
    System.out.println(Arrays.toString(result));

    }
    public  int[] rotate(int[] nums, int k) {
        int [] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[(i+k)%nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=res[i];
        }
        return res;
    }
}
