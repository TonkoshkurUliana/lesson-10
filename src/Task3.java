import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        System.out.print("Введіть, будь ласка, текст: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] word = br.readLine().split(" ");
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() >= 3) {
                count++;
            }
        }
        System.out.println("Кількість слів у цьому реченні: " + count);
    }
}
