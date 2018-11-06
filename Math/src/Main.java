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

        //Test: majorityElementByNegative
        int[] nums = new int[]{2,6,6,2,4,5,6,6,6,6,6,7,6,9,8,6,6};
        int majorityElement = MajorityElement.majorityElementByNegative(nums);
        System.out.println("majorityElement = "+majorityElement);
    }
}
