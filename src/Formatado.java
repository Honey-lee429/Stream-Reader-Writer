import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.spi.LocaleNameProvider;

public class Formatado {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("contas.csv"));

       /* while (scanner.hasNext()){
            var s = scanner.nextLine();
            System.out.println(s);
        }
            System.out.println("------------------------");

        //CC,22,33,Nico Steppat,210.1
        //CP,11,55,Luan Silva,1300.98
        //CC,22,44,Ana Garcias,350.40
        //------------------------
*/

        while (scanner.hasNextLine()) {
            var linha = scanner.nextLine();
            Scanner scanner1 = new Scanner(linha);
            scanner1.useLocale(Locale.US);
            scanner1.useDelimiter(",");

            var tipo = scanner1.next();
            var agencia = scanner1.nextInt();
            var conta = scanner1.nextInt();
            var titular = scanner1.next();
            var saldo = scanner1.nextDouble();
            // CC2233Nico Steppat210.1
            //CP1155Luan Silva1300.98
            //CC2244Ana Garcias350.40
            //System.out.println(tipo + next2 + conta + titular+ next5);

            var format = String.format(new Locale("pt", "BR"),
                    "%s: %04d - %05d, %s, R$ %06.2f",
                    tipo, agencia, conta, titular, saldo);
            System.out.println(format);
            // CC: 0022 - 00033, Nico Steppat, R$ 210,10
            //CP: 0011 - 00055, Luan Silva, R$ 1300,98
            //CC: 0022 - 00044, Ana Garcias, R$ 350,40

            scanner1.close();
        }

        scanner.close();
    }
}
