import java.util.*;
public class Factorial{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num,fact=1;

        System.out.print("enter the number:");
        num= sc.nextInt();

        for(int i=1;i<=num;i++){

            fact=fact*i;
        }
        System.out.println("the factorial of "+num+" is : "+fact);
    }
}