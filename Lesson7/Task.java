package Lesson7;

public class Task
{
    public static void main(String[] args)
    {
        System.out.println("123-123");
        System.out.println(leftDigits(1234,2));
        System.out.println(leftDigits(567,1));
        System.out.println(leftDigits(892456,3));
    }
    public static int leftDigits (int n,int k)
    {
        int count=0,num=n;
       while (n!=0)
       {
           count++;
           n=n/10;
       }


        return num/(int) Math.pow(10,count-k);
    }


}

