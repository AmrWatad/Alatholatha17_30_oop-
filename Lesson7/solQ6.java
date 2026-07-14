package Lesson7;

public class solQ6 {
    public static void main(String[] args) {
        System.out.println(leftDigits(1234,2));//12
        System.out.println(leftDigits(567,1));//5
        System.out.println(leftDigits(892456,3));//892
    }
    public static int leftDigits(int n,int k){

        int length=findDigits(n);//length


        return n/( (int)Math.pow(10,length-k)) ;
    }
    public  static int rightDigits(int n,int k){

        return n%((int)Math.pow(10,k)) ;

    }

    private static int findDigits(int n) {
       int count=0;
       while (n!=0){
           count++;
           n=n/10;
       }

       return count;
    }
}
