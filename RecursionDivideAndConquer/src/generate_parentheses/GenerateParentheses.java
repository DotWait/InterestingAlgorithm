package generate_parentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    /**
     *  括号生成
     *  Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
     *
     * For example, given n = 3, a solution set is:
     *
     * [
     *   "((()))",
     *   "(()())",
     *   "(())()",
     *   "()(())",
     *   "()()()"
     * ]
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n){
        List<String> result = new ArrayList<>();
        gen("",result,n,n);
        return result;
    }

    public void gen(String sublist,List<String> result,int left,int right){
        //递归终止条件
        if(left == 0 && right == 0){
            result.add(sublist);
            return;
        }
        if (left>0)
            gen(sublist+"(",result,left-1,right);
        if (right>left)
            gen(sublist+")",result,left,right-1);
    }
}
