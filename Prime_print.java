import java.util.*;

public class Prime_print {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the range:");
        int a= sc.nextInt();
        int num = 1; 

        while (num <= a) {
            int count = 0;

            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(num + " is a prime number");
            }

            num++;
        }
    }
}
