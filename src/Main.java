import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(5);
        Scanner input = new Scanner(System.in);
        System.out.println("enter a your first number");
        int yourNum = input.nextInt();
        numbers.add(yourNum);
        System.out.println(numbers);
        System.out.println("enter your next number");
        yourNum = input.nextInt();
        numbers.add(yourNum);
        System.out.println(numbers);
        System.out.println("enter your next number");
        yourNum = input.nextInt();
        numbers.add(yourNum);
        System.out.println(numbers);
        System.out.println("enter your next number");
        yourNum = input.nextInt();
        numbers.add(yourNum);
        System.out.println(numbers);
        System.out.println("enter one last number");
        yourNum = input.nextInt();
        numbers.add(yourNum);
        System.out.println(numbers);
        int sum = 0;
        int product = 1;
        int largest = 0;
        int smallest = numbers.get(0);
        for (int num:numbers){
            sum += num;
            product *= num;
            if (num > largest){
                largest = num;
            }
            if (num < smallest){
                smallest = num;
            }
        }
        System.out.printf("Sum = %d\n",sum);
        System.out.printf("Product = %d\n",product);
        System.out.printf("Largest = %d\n",largest);
        System.out.printf("Smallest = %d\n",smallest);
    }
}