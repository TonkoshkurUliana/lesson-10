import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException, MyException {

        System.out.print("Введіть, будь ласка, поліндром («пилип», «ротор») з 5 символів: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer word = new StringBuffer(br.readLine()).reverse();
        String poli = word.reverse().toString();
        try {
            if (word.toString().length() != 5) {
                throw new MyException("Слово складається не з 5 букв");
            } else {
                if (word.toString().equalsIgnoreCase(poli)) {
                    System.out.println("Це слово є поліндромом!");
                } else {
                    System.out.println("Це слово не є поліндромом!");
                }
            }
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}