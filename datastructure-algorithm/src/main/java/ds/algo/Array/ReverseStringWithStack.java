/**
 * 
 */
package ds.algo.Array;

import java.util.Stack;

/**
 * @author SGaikwad
 *
 */
public class ReverseStringWithStack
{

    public static void main(String[] args)
    {
        reverseString("sandep");
    }

    public static void reverseString(String input)
    {
        Stack<Character> stack = new Stack<>();
        char[] carArray = input.toCharArray();
        System.out.println("User Input " + new String(carArray));
        for (Character charVal : carArray)
        {
            stack.push(charVal);
        }

        for (int i = 0; i < carArray.length; i++)
        {
            carArray[i] = stack.pop();
        }

        System.out.println("User Output " + new String(carArray));

    }
}
