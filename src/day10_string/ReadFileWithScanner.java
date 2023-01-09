package day10_string;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFileWithScanner {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("src/day10_string/Test.txt"));





//If you wanna readtxt file word by word(Lets say 4 words-repeat next() method 4 times):
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());

        // System.out.println(scan.hasNext());

        scan.close();












    }
}
