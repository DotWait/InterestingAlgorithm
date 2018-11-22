import generate_parentheses.GenerateParentheses;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Test: powByRecursion
/*        double result = CalculatesPow.powByRecursion(2.00000
                ,-2147483648);
        System.out.println("result:"+result);*/

        //Test: powByWhile
/*        double result1 = CalculatesPow.powByWhile(2, -2147483648);
        System.out.println("result:"+result1);*/

        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> result = generateParentheses.generateParenthesis(3);
        for (String s : result)
            System.out.println(s);

    }
}
