import java.util.*;
public class easy{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        //Input the string
        String str=sc.nextLine();
        //split the sentence into words and store it in array st
        String []st=str.split(" ");
        /*laststr stores the length of the last word.
        retrieve the last element of the array i.e the last word of the sentence */
        int laststr=st[st.length-1].length();
        System.out.println("the length of the last word of the string is: "+laststr);
    }
}