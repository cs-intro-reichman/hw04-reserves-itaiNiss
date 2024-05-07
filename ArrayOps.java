public class ArrayOps {
    public static void main(String[] args) 
    {
        //int[] test1 = {-2,-2,-2,3,1};
        //int[] test2 = {1, 3, 2};
        //System.out.println(findMissingInt(new int[] {0})); 
        //System.out.println(secondMaxValue(test1)); 
        //System.out.println(secondMaxValue(test2));
        //System.out.println(containsTheSameElements(test1, test2));
        //System.out.println(isSorted(test2));
    }
    public static int advance (int[] array, int value)
    {
        int index = -1;
        for(int i = 0; i < array.length; i++)
        {
            if (array[i] == value) 
            {
                index = i;
                break;    
            }
        }
        return index;
    }

    public static int findMissingInt (int [] array) {
        // Write your code here:
        for(int i = 0; i < array.length; i++)
        {
            if (advance(array, i) == -1)
            {
                return i;    
            }
        }
        return array.length;
    }

    public static int arrayMax(int [] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] > max )
            {
                max = array[i];
            }   
        }
        return max;
    }

    public static int arrayMin(int [] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] < min )
            {
                min = array[i];
            }   
        }
        return min;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int max = arrayMax(array);
        int secondMax = arrayMin(array);
        int count = 0;
        for(int i = 0; i < array.length; i++)
        {
            if (array[i] == max) 
            {
                count++;
                if(count == 2)
                {
                    return max;
                }   
            }
            if (array[i] >= secondMax && array[i] != max) 
            {
                secondMax = array[i];
            }
        }
        return secondMax;


    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] < array[i - 1]) 
            {
                increasing = false;
                break;
            }
        }
        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] > array[i - 1]) 
            {
                decreasing = false;
                break;
            }
        }
        return increasing || decreasing;

    }

    public static boolean containsTheSameElements(int [] array1, int [] array2) {
        // Write your code here:
        for (int i = 0; i < array1.length; i++) 
        {
            boolean found = false;
            for (int j = 0; j < array2.length; j++) 
            {
                if (array1[i] == array2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) 
            {
                return false;
            }
        }
        for (int i = 0; i < array2.length; i++) 
        {
            boolean found = false;
            for (int j = 0; j < array1.length; j++) 
            {
                if (array1[j] == array2[i]) 
                {
                    found = true;
                    break;
                }
            }
            if (!found) 
            {
                return false;
            }
        }
        return true;
    }
    
}
