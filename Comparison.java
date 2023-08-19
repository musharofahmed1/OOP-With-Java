 import java.util.Scanner;
 public class Comparison{
    public static void main(String[] args){
        //create Scanner
        Scanner input = new Scanner(System.in);

        int number1,number2;

        System.out.printf("Enter Number1: ");
        number1 = input.nextInt();

        System.out.printf("Enter Number2: ");
        number2 = input.nextInt();

        if(number1 == number2)
            System.out.printf("%d == %d%n",number1,number2);
        
        if(number1 != number2)
             System.out.printf("%d != %d%n",number1,number2);

        if(number1 < number2)
            System.out.printf("%d < %d%n",number1,number2);

        if(number1 > number2)
            System.out.printf("%d > %d%n",number1,number2);

        if(number1 >= number2)
            System.out.printf("%d >= %d%n",number1,number2);

        if(number1 <= number2)
            System.out.printf("%d <= %d%n",number1,number2);
    }
 }
