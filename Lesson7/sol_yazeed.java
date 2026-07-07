package Lesson7;

public class sol_yazeed {
    public static int leftDigits(int num, int k) {
        int temp = num;
        int length = 0;
        while (temp > 0) {
            length++;
            temp /= 10;
        }
        int digitsToRemove = length - k;
        for (int i = 0; i < digitsToRemove; i++) {
            num /= 10;
        }
        return num;
    }
}
