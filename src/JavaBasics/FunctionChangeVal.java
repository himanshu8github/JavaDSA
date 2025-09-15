package JavaBasics;

import java.util.Arrays;

public class FunctionChangeVal {

    public static void main(String[] args) {
        int[] arr = {1,5,6,89,5,3,2};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 77;
    }
}
