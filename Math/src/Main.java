import math.CountBits;
import math.HammingWeight;
import math.PowerOfTwo;

public class Main {

    public static void main(String[] args) {
/*        //Test: majorityElement
        int[] nums = new int[]{2,6,6,2,4,5,6,6,6,6,6,7,6,9,8,6,6};
        int majorityElement = MajorityElement.majorityElement(nums);
        System.out.println("majorityElement = "+majorityElement);*/

/*        //Test: majorityElementBySort
        int[] nums = new int[]{2,6,6,2,4,5,6,6,6,6,6,7,6,9,8,6,6};
        int majorityElement = MajorityElement.majorityElementBySort(nums);
        System.out.println("majorityElement = "+majorityElement);*/

/*        //Test: majorityElementByNegative
        int[] nums = new int[]{2,6,6,2,4,5,6,6,6,6,6,7,6,9,8,6,6};
        int majorityElement = MajorityElement.majorityElementByNegative(nums);
        System.out.println("majorityElement = "+majorityElement);*/

        //Test: isPowerOfTwo
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        boolean isPowerOfTwo = powerOfTwo.isPowerOfTwo(4);
        System.out.println("isPowerOfTwo = " + isPowerOfTwo);

        //Test: countsBits
        CountBits countBits = new CountBits();
        int[] bits = countBits.countBits(5);
        for (int bit : bits)
            System.out.println("bits = " + bit);

        //Test: hammingWeight
        HammingWeight hammingWeight = new HammingWeight();
        int weight = hammingWeight.hammingWeight(11);
        System.out.println("weight = " + weight);

    }
}
