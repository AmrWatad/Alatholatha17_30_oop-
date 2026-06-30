package Lesson7;

public class sol_mohammed {
    public static void main(String[] args) {
        System.out.println(leftdigit(3,3453787));
    }

    public static int leftdigit(int k , int num){
        int count =0;
while (num != 0){
    num = num/10;
    count++;
}
k=count-k;
    int pow = (int)Math.pow(10,k);

int fainal = num / pow;
        return fainal;
    }
}