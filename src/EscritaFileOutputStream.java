import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class EscritaFileOutputStream {
    public static void main(String[] args) throws IOException {
        //Fluxo de saida de arquivo
        FileOutputStream file = new FileOutputStream("write.txt"); //Esta classe serve para escrever bytes num arquivo
        OutputStreamWriter writerChar = new OutputStreamWriter(file); // Esta classe serve para escrever char num arquivo
        BufferedWriter writeLine = new BufferedWriter(writerChar); // Esta classe serve para escrever linhas num arquivo

         writeLine.write("asdfadadad sasdf asdf asdf");
         writeLine.newLine();
         writeLine.write("asdf çlj oiekds");

         writeLine.close();


    }
}
