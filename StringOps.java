public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        //String input = "aaAAa AAaAA bbbBBbccccCCC eee IIIii ooOOO uuu UUUU!!";
       // String result = capVowelsLowRest(input);
       // System.out.println(result);

       //String input = " Intro to  coMPUter  sCIEncE";
       //String result = camelCase(input);
       //System.out.println(result);
       //int[] indexes1 = allIndexOf("MMMM",'M');
       //printArray(indexes1);

        
    }
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
    public static String capVowelsLowRest(String input) {
        String result = "";
        boolean isNewWord = true;

        for (int i = 0; i < input.length(); i++) 
        {
            char currentChar = input.charAt(i);

            if (currentChar == ' ') 
            {
                result += currentChar;
                isNewWord = true;
            } 
            else 
            {
                if (isVowel(currentChar))
                {
                    result += toUpperCase(currentChar); 
                    isNewWord = false;
                }
                else 
                {
                    result += toLowerCase(currentChar); 
                }
            }
        }

        return result;
        }
    private static char toUpperCase(char ch) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                return (char)(ch - 32);
            }
            return ch;
        }
    private static char toLowerCase(char ch) {
            if ((ch > 'A' && ch <= 'Z') && (ch != 'E' || ch != 'I' || ch == 'O' || ch == 'U'))
            {
                return (char)(ch + 32);
            }
            return ch;
        }
    public static boolean isLetter(char chr){
        return ('a' <= chr && chr <= 'z') || ('A' <= chr && chr <= 'Z');
    }    
    public static String camelCase (String input) {
        // Write your code here:
        String result = "";
        boolean isFirstWord = true;
        boolean isFirstLetter = true;
        
        for (int i = 0; i < input.length(); i++) 
        {
            char currentChar = input.charAt(i);
            if (currentChar == ' ')
            {
                isFirstWord = false;
                isFirstLetter = true;
                continue;
            }
            
            if (isFirstWord) 
            {
                if (isFirstLetter) 
                {
                    result += toLowerCase2(currentChar); 
                    isFirstLetter = false;
                } 
                else 
                {
                    result += toLowerCase2(currentChar); 
                }
            } 
            else 
            {
                if (isFirstLetter) 
                {
                    result += toUpperCase2(currentChar); 
                    isFirstLetter = false;
                } 
                else 
                {
                    result += toLowerCase2(currentChar); 
                }
            }
        }

        return result;

    }
    private static char toUpperCase2(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char)(ch - 32);
        }
        return ch;
    }
    private static char toLowerCase2(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char)(ch + 32);
        }
        return ch;
    }
    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                count++;
            }
        }

        int[] indexes = new int[count];
        int index = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                indexes[index++] = i;
            }
        }

        return indexes;
        
    }
    public static void printArray(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("}");
    }
}
