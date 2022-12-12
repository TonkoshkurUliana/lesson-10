import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Task2 {
    public static void main(String[] args) throws IOException {
        System.out.print("Введіть, будь ласка, текст: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine().toLowerCase(Locale.ROOT);
        int l = text.length();
        Character a = new Character('а');
        Character o = new Character('о');
        Character y = new Character('у');
        Character e = new Character('е');
        Character u = new Character('и');
        Character j = new Character('і');

        if (text.indexOf(a) > -1 || text.indexOf(o) > -1 || text.indexOf(y) > -1 || text.indexOf(e) > -1 || text.indexOf(u) > -1 || text.indexOf(j) > -1) {
            System.out.println(text.replace(a, '-').replace(o, '-').replace(y, '-').replace(e, '-').replace(u, '-').replace(j, '-'));
        } else {
            System.out.println(text);
        }
    }
}
