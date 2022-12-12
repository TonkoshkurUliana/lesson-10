import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        System.out.print("Введіть, будь ласка, текст: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] word = br.readLine().split(" ");
        int count;
        int countmax = 0;
        int idmax = 0;
        int id = 0;
        for (int i = 0; i < word.length; i++) {
            count = 0;
            for (int j= 0; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    count++;
                    id = i;
                }
            }
            if (countmax < count){
                countmax = count;
                idmax = id;
            }
        }
        System.out.println("Найчастіше зустрічається слово '" + word[idmax] + "' - "+ countmax + " разів");

    }
}
