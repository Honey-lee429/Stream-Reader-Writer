import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.spi.LocaleNameProvider;

public class LeituraScanner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNext()) {
            var linha = scanner.nextLine();
            System.out.println(linha);
            // CC,22,44,Ana Garcias,350.40

            System.out.println(linha.split(","));
            // [Ljava.lang.String;@7e6cbb7a

            var s = Arrays.toString(linha.split(","));
            System.out.println(s);
            // [CC, 22, 44, Ana Garcias, 350.40]


            Scanner scanner1 = new Scanner(linha);
            scanner1.useLocale(Locale.US);
            scanner1.useDelimiter(",");
            var next = scanner1.next();
            var next1 = scanner1.next();
            var next2 = scanner1.next();
            var next3 = scanner1.next();
            var next4 = scanner1.next();
            System.out.println(next + next1 + next2 + next3 + next4);
            // CC2244Ana Garcias350.40

            scanner1.close();
        }

        scanner.close();

    }
}
