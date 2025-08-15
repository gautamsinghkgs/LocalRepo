import java.util.Scanner;
public class Fibonacci_Non_Recursive {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Terms :");
        int n = sc.nextInt();
        int a1 = 0;
        int a2 = 1;
        int next = a1+a2;
        int i=3;

        System.out.print("Fibonacci Series is : ");
        System.out.print(a1+" "+a2+" ");

        do{
            System.out.print(next+" ");
            a1=a2;
            a2=next;
            next=a1+a2;
            i++;
        }while(i<=n);
    }
}
