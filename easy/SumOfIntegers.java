package easy;
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();
        
        String[] parts = input.split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            numbers.add(Integer.parseInt(part));
        }
        
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; 
        }
        
        System.out.println("Sum of numbers: " + sum);
        
        scanner.close();
    }
}
