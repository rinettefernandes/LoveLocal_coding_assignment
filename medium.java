Question: Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Solution: 
import java.util.*;
public class medium{
    public static void main(String []args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the size of the array");
         int size=sc.nextInt();
         System.out.println("enter the array elements");
         int arr[]=new int[size];
         int count=0;
         for(int i=0;i<size;i++)
         {
            //entering the array elements
            arr[i]=sc.nextInt();
         }
         //sort the array
         Arrays.sort(arr);
         for(int i=0;i<size-1;i++)
        {
            /*checking if the adjacent elements are equal..if they are equal incrementing the count.
            this indicates that the current element is repeating*/
            if(arr[i]==arr[i+1])
                count++;
            else
            {
                //check whether the count is greater than size/3
                if(count>size/3)
                   System.out.println("the array element that repeats more than size/3 times are: "+arr[i]);
                //reset count to 1 to represent count for other elements
                count=1;
            }
        }
        //check for the last element of the array
        if(count>size/3)
            System.out.println("the array element that repeats more than size/3 times are:"+arr[size-1]);

    }
}
