import java.util.*;

public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r,temp,sum=0;

        System.out.print("enter a number:");
        int num= sc.nextInt();
        temp=num;
        while(num!=0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum){
            System.out.print("given number is Palindrome");
        }
        else{
            System.out.print("given number is not Palindrome");
        }

    }
}