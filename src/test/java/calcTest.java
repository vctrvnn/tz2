package src.test.java;
import org.junit.*;

import src.main.java.calc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class calcTest {
    @Test
    public void test1(){
        String testFilePath = "src/test/recources/test1.txt";
        try {
            File file = new File(testFilePath);
            Scanner scanner = new Scanner(file);
            String[] numbersArray = scanner.nextLine().split(" ");
            Assert.assertEquals(1, calc._min(numbersArray));

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test2(){
        String testFilePath = "src/test/recources/test2.txt";
        try {
            File file = new File(testFilePath);
            Scanner scanner = new Scanner(file);
            String[] numbersArray = scanner.nextLine().split(" ");
            Assert.assertEquals(232, calc._max(numbersArray));
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3(){
        String testFilePath = "src/test/recources/test3.txt";
        try {
            File file = new File(testFilePath);
            Scanner scanner = new Scanner(file);
            String[] numbersArray = scanner.nextLine().split(" ");
            Assert.assertEquals(14, calc._sum(numbersArray));
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void multTest(){
        String testFilePath = "src/test/recources/test4.txt";
        try {
            File file = new File(testFilePath);
            Scanner scanner = new Scanner(file);
            String[] numbersArray = scanner.nextLine().split(" ");
            Assert.assertEquals(0, calc._mult(numbersArray));
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void mintimeTest(){
        String testFilePath = "src/test/recources/test5.txt";
        try {
            File file = new File(testFilePath);
            Scanner scanner = new Scanner(file);
            String[] numbersArray = scanner.nextLine().split(" ");
            calc._min(numbersArray);
            Assert.assertEquals(1000000, numbersArray.length);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void maxtimeTest(){
        String testFilePath = "src/test/recources/test6.txt";
        try {
            File file = new File(testFilePath);
            Scanner scanner = new Scanner(file);
            String[] numbersArray = scanner.nextLine().split(" ");
            calc._max(numbersArray);
            Assert.assertEquals(1000000, numbersArray.length);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void sumtimeTest(){
        String testFilePath = "src/test/recources/test7.txt";
        try {
            File file = new File(testFilePath);
            Scanner scanner = new Scanner(file);
            String[] numbersArray = scanner.nextLine().split(" ");
            calc._sum(numbersArray);
            Assert.assertEquals(1000000, numbersArray.length);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void multtimeTest(){
        String testFilePath = "src/test/recources/test8.txt";
        try {
            File file = new File(testFilePath);
            Scanner scanner = new Scanner(file);
            String[] numbersArray = scanner.nextLine().split(" ");
            calc._mult(numbersArray);
            Assert.assertEquals(1000000, numbersArray.length);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testEmptyFile() {
        String filename = "src/test/recources/test9.txt";
        createEmptyFile(filename);
        calc.main(new String[]{filename});

    }

    private void createEmptyFile(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

