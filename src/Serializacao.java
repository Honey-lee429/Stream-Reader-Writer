import java.io.*;

public class Serializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // É boa prática colocar o atributo estático serialVersionUID na classe quando queremos serializar um objeto:
        // private static final long serialVersionUID = 1L;


        /*String txt = "eu prefiro ser essa metamorfose ambulante";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serializacao.bin"));
        objectOutputStream.writeObject(txt);
        objectOutputStream.close();*/

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("serializacao.bin"));
        String name = (String) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(name);




    }
}
