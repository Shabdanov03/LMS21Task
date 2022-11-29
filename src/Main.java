import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] letters = {"A a", "B b", "C c", "D d", "E e", "F f", "G g", "H h",
                "I i", "J j", "K k", "L l", "M m", "N n", "O o", "P p", "Q q",
                "R r", "S s", "T t", "U u", "V v", "W w", "X x", "Y y", "Z z"};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        try (FileWriter fileWriter = new FileWriter("alphabet.txt")) {
            for (String letter : letters) {
                fileWriter.write(letter+"\n");
            }
            for (int number : numbers) {
                fileWriter.write(number+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader("alphabet.txt");
            Scanner scanner = new Scanner(fileReader);
            int counter = 0;
            while (scanner.hasNextLine()) {
                counter++;
                System.out.println(counter+" :  "+scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println(" No such file ! ");
        }
    }
}