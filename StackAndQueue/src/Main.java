import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * <p>
     * An input string is valid if:
     * <p>
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * <p>
     * Note that an empty string is also considered valid.
     * <p>
     * Example 1:
     * Input: "()"
     * Output: true
     * <p>
     * Example 2:
     * Input: "()[]{}"
     * Output: true
     * <p>
     * Example 3:
     * Input: "(]"
     * Output: false
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for (Character c : chars) {
            if (map.containsValue(c)) stack.push(c);
            else if (stack.empty() || !stack.pop().equals(map.get(c))) return false;
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        //Test: isValid
/*        String s = "((())){}{[]()}";
        boolean isValid = isValid(s);
        System.out.println("isValid = " + isValid);*/

        //Test: KthLargest
/*        KthLargest kthLargest = new KthLargest(5,new int[]{2,4,1,6,4,7,5,4,9,11});
        int param = kthLargest.add(9);
        System.out.println("param="+param);*/

        //Test: maxSlidingWindow
//        int[] nums = new int[]{5,3,2,1,7,4,3,8,5,6,3,3,8,9,0,7,5};
        int[] nums = new int[]{};
        int[] result = MaxSlidingWindow1.maxSlidingWindow(nums,3);
        for (int num : result)
            System.out.println(num);
    }
}
