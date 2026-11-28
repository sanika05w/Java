import java.nio.file.*;

public class FileWriteRead
{
    public static void main(String[] args) throws Exception {
        Path p = Files.createTempFile("demo", ".txt");
        Files.writeString(p, "Hello from Java file I/O");
        System.out.println(Files.readString(p));
        Files.delete(p);
    }
}
