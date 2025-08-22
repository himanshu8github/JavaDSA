package BitManipulation;

public class FindUnique {
    public static void main(String[] args) {
//        int[] arr = {2, 8, 6, 11, -2, -8, -6, 2, 8, 6, -2, -8, -6};
        int[] arr = {2,2,3,2,7,7,8,7,8,8};
        System.out.println("Here is the ans : " + ans(arr));
    }

    private static int ans(int[] arr){
    int unique = 0;

    for (int n : arr){
        unique ^= n;

    }
    return unique;
    }
}
