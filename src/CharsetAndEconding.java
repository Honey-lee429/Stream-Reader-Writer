import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;


public class CharsetAndEconding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        var charset = Charset.defaultCharset(); // a classe que representa um encoding ou Character Set é
        // Charset e o método estático para retornar uma referência com o charset default é defaultCharset()
        System.out.println(charset.displayName());

        String s1 = "13º Órgão Oficial";
        System.out.println(s1);
        System.out.println(s1.codePointAt(0)); // a classe String possui um método chamado codePointAt() para
        // revelar o codepoint de determinado caractere a partir de sua posição na string.

        Charset utf16 = StandardCharsets.UTF_16;
        byte[] bytes = s1.getBytes(utf16); //transformar os caracteres em bytes
        String s2 = new String(bytes, utf16);
        System.out.println(s2 + " tamanho "+ bytes.length);

        bytes = s1.getBytes("windows-1252");
        String s3 = new String(bytes, "windows-1252");
        System.out.println(s3 + " tamanho "+ bytes.length);
    }
}

