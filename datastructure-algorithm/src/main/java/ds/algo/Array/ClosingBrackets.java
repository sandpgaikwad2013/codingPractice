/**
 * 
 */
package ds.algo.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author SGaikwad
 *
 */
public class ClosingBrackets
{
    static Map<Character, Character> brackets = new HashMap<>();

    static
    {
        brackets.put('{', '}');
        brackets.put('[', ']');
        brackets.put('(', ')');

    }

    public static void main(String[] args)
    {
        String input = "{{}}";
        boolean result = isBracketsAreClosed(input);
        if (result)
        {
            System.out.println("brackets are closed properly " + input);
        }
        else
        {
            System.out.println("brackets are notclosed " + input);
        }

    }

    public static boolean isBracketsAreClosed(String input)
    {
        Stack<Character> stack = new Stack<>();

        for (Character charVal : input.toCharArray())
        {
            if (brackets.containsKey(charVal))// if its opening bracket
            {
                stack.push(charVal);// add to stack
            }
            else// if its closing bracket
            {
                Character closingBracket=null;
                if (!stack.isEmpty())
                {
                    Character popTheOpeingBrace = stack.pop();// pop the opening brace
                    closingBracket = brackets.get(popTheOpeingBrace);
                }
                if (!charVal.equals(closingBracket))
                {
                    return false;
                }

            }

        }

        return true;
    }

}
