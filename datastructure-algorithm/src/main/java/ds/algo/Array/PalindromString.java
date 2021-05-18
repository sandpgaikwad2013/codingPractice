package ds.algo.Array;

public class PalindromString
{

    public static void main(String[] args)
    {
        if (isPalindrom("ABAa"))
        {
            System.out.println("String is palindrom ");
        }
        else
        {
            System.out.println("String is not palindrom");
        }

    }

    public static boolean isPalindrom(String var)
    {
        if (var.isEmpty() || var.length() == 1)
        {
            return true;
        }

        char[] arrayOfString = var.toCharArray();

        int start = 0;
        int end = arrayOfString.length - 1;

        while (start < end)
        {

            if (arrayOfString[start] != arrayOfString[end])
            {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

}
