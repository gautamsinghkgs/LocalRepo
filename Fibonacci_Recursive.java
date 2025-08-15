import java.util.Scanner;
public class Fibonacci_Recursive {
    public static int recursion(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return recursion(n-1) + recursion(n-2);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Terms : ");
        int n = sc.nextInt();
        System.out.print("Fibonacci Series is : ");
        for(int i=0;i<n;i++){
            System.out.print(recursion(i)+" ");
        }
    }
}

