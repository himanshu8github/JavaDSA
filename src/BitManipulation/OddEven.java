package BitManipulation;

public class OddEven {
    public static void main(String[] args){
        int n = 31;
        System.out.println("Here is the result : " + findOddEven(n));

    }

    private static boolean findOddEven(int n){

        return ((n & 1) == 1);
    }

}
