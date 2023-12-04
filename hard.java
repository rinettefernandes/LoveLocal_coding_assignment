//Question 3: Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.

//solution
import java.util.*;
public class hard {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        //Input the number
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
              int num=i;
               //extract the digits of each number until num>0
              while(num>0)
              {
               
                int rem=num%10;
                //remove the digit that is processed
                num=num/10;
                //if the digit is 1 increment the count
                if(rem==1)
                   count++;
                  
              }
        }
        System.out.println("the number of times the digit 1 appearing in the numbers less than or equal to n is:"+count);
    }
    
}
