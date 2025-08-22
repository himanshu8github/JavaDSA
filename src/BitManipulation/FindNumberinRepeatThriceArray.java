package BitManipulation;

public class FindNumberinRepeatThriceArray {

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2, 7, 7, 8, 7, 8, 8};
        System.out.println("Unique number is : " + findUnique(arr));
    }

    private static int findUnique(int[] arr) {
        int ones = 0, twos = 0;

        for (int num : arr) {
            // add 'num' to 'twos' if it's already in 'ones'
            twos |= (ones & num);

            //  bits in 'ones'
            ones ^= num;

            // mask to clear bits appearing 3 times
            int commonMask = ~(ones & twos);

            // clear tripled bits
            ones &= commonMask;
            twos &= commonMask;
        }

        return ones; // at the end, 'ones' has the unique number
    }
}
