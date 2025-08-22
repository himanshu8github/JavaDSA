package BitManipulation;

public class Find_ithbitOfANumber {

    public static void main(String[] args) {
        int n = 13; // 1101
        int i = 1;

        System.out.println("Approach Shift  : " + getBitShift(n, i));

    }


    private static int getBitShift(int n, int i) {
        return (n >> i) & 1;
    }


}
