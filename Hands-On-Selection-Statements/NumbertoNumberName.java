/*Johanna, a 5-year-old girl, is learning the number names. She is having difficulty remembering all of the words. To give her extra practice, her mother assigns a number and instructs her to write the number names separated by white space. Help her mum by writing a Java program that prints the number names of the numbers so Johanna may check the answers herself.

Assume that she is learning from zero to nine.
Note:
    Number should not start with zero
    In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
    Ensure to follow the object-oriented specifications provided in the question description.
    Ensure to provide the names for classes, attributes, and methods as specified in the question description.    Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program. 
Sample Input 1
Enter the number
58723
Sample Output 1 
five eight seven two three */

import java.util.Scanner;

public class NumbertoNumberName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Number should not start with zero");
        } else {
            printNumberNames(number);
        }
        sc.close();
    }

    private static void printNumberNames(int number) {
        String[] numberNames = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        StringBuilder output = new StringBuilder();
        while (number > 0) {
            int digit = number % 10;
            output.insert(0, numberNames[digit] + " ");
            number = number / 10;
        }
        System.out.println(output.toString().trim());
    }
}

// Code author: Vardhan Sanagapalli
