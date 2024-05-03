package src.main.java;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class maxExTimes {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("max_execution_times.csv");
            writer.write("Number of Numbers,Execution Time (ms)\n");

            for (int i = 10000; i <= 1000000; i += 10000) {
                String[] numsArray = generateNumbers(i);

                long startTime = System.currentTimeMillis();
                calc._sum(numsArray);
                long endTime = System.currentTimeMillis();
                long executionTime = endTime - startTime;

                writer.write(i + "," + executionTime + "\n");
            }

            writer.close();
            System.out.println("График зависимости времени выполнения от количества чисел в файле построен в файле max_execution_times.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String[] generateNumbers(int count) {
        Random random = new Random();
        String[] arr = new String[count];
        for (int i = 0; i < count; i++) {
            arr[i] = String.valueOf(random.nextInt(100));
        }
        return arr;
    }
}
