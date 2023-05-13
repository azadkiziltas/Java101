package pratik.FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int number1=0,number2=1,sum,input;

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet gösterilsin : ");
        input = scan.nextInt();
        
        for(int i=0;i<input;i++){
            System.out.print(number1 + " ");
            sum = number1 + number2;
            number1 = number2;
            number2 = sum;
        }
        scan.close();
    }

    
}
