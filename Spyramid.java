import java.util.*;

public class Variable{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter no of rows:");
        int a = scan.nextInt();
        
        for(int i=1;i<=a;i++){
            // for printing blank spaces
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            // for printing star spaces
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    } 
}