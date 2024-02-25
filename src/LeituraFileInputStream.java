import java.io.*;

public class LeituraFileInputStream {
    public static void main(String[] args) throws IOException {
        //Flluxo de entrada de arquivo
        FileInputStream file = new FileInputStream("lorem.txt"); //Esta classe serve para escrever bytes num arquivo
        InputStreamReader readerChar = new InputStreamReader(file); // Esta classe serve para escrever char num arquivo
        BufferedReader readerLine = new BufferedReader(readerChar); // Esta classe serve para escrever linhas num arquivo
        var readerFile = readerLine.readLine();

        while (readerFile != null) {
            System.out.println(readerFile);
            readerFile = readerLine.readLine();
        }

    }
}
