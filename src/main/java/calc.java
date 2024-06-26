package src.main.java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        String filePath = "src/main/recources/numbers.txt";
        
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            String[] numbersArray = scanner.nextLine().split(" ");

            int min = _min(numbersArray);
            int max = _max(numbersArray);
            int sum = _sum(numbersArray);
            int mult = _mult(numbersArray);

            System.out.println("Минимальное: " + min);
            System.out.println("Максимальное: " + max);
            System.out.println("Сумма: " + sum);
            System.out.println("Произведение: " + mult);
            
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
            e.printStackTrace();
        }
    }
    
    public static int _min(String[] numbers) {
        int min = Integer.MAX_VALUE;
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    
    public static int _max(String[] numbers) {
        int max = Integer.MIN_VALUE;
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    public static int _sum(String[] numbers) {
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
    
    public static int _mult(String[] numbers) {
        int mult = 1;
        for (String number : numbers) {
            mult *= Integer.parseInt(number);
        }
        return mult;
    }
}
