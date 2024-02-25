import java.io.*;

public class EscritasDiversas {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("file_writer.txt");
        fileWriter.write("asdf asdf asf");
        fileWriter.write(System.lineSeparator());
        fileWriter.write("\n");
        fileWriter.write("çlj çlkj çlj çlkj");
        fileWriter.close();

        /* Utilizando o BufferedWriter */
        //FileWriter fileWriter1 = new FileWriter("file_writer.txt");
        //BufferedWriter bufferedWriter = new BufferedWriter(fileWriter1);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file_writer1.txt"));
        bufferedWriter.write("asdf asdf asf");
        bufferedWriter.newLine();
        bufferedWriter.write("çlj çlkj çlj çlkj");
        bufferedWriter.close();

        /* Utilizando o PrintStream */
        PrintStream printStream = new PrintStream("file_print.txt");
        printStream.println("asdf asdf llllj");
        printStream.println("hoje eu preciso ouvir qualquer palavra tua");
        printStream.close();

        /* Utilizando o PrintWriter */
        PrintWriter printWriter = new PrintWriter("file_print.txt");
        printWriter.println("asdf asdf llllj");
        printWriter.println("hoje eu preciso ouvir qualquer palavra tua");
        printWriter.close();


    }
}
