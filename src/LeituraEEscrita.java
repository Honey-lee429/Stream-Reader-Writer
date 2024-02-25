import java.io.*;
import java.net.Socket;

public class LeituraEEscrita {
    public static void main(String[] args) throws IOException {
        //a classe System possui outros métodos, alguns são poucos usados, outros mais. Entre os mais usados está
        // o método currentTimeMillis();
        long ini = System.currentTimeMillis();

        /*
        Socket s = new Socket();
        //Fluxo de entrada e saida via rede
        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();
*/
        //Fluxo de entrada via digitação e saida via console
        InputStream inputIn = System.in;
        OutputStream outputOut = System.out;

        //Flluxo de entrada via arquivo
        FileInputStream file = new FileInputStream("lorem.txt"); //Esta classe serve para escrever bytes num arquivo
        InputStreamReader readerChar = new InputStreamReader(file); // Esta classe serve para escrever char num arquivo
        BufferedReader readerLine = new BufferedReader(readerChar); // Esta classe serve para escrever linhas num arquivo
        var readerFile = readerLine.readLine();

        //Fluxo de saida via arquivo
        FileOutputStream file1 = new FileOutputStream("loremSaida.txt"); //Esta classe serve para escrever bytes num arquivo
        OutputStreamWriter writerChar = new OutputStreamWriter(file1); // Esta classe serve para escrever char num arquivo
        BufferedWriter writeLine = new BufferedWriter(writerChar); // Esta classe serve para escrever linhas num arquivo

        while (readerFile != null) {
            writeLine.write(readerFile);
            writeLine.newLine();
            readerFile = readerLine.readLine();
        }

        readerLine.close();
         writeLine.close();

        long fim = System.currentTimeMillis();

        System.out.println("passaram " + (fim-ini) + " milissegundos");

    }
}
