
import java.io.FileReader;
import java.io.IOException;

public class ReaderFromFile {

    public static void reader(){

        try(FileReader reader = new FileReader("src\\main\\resources\\input.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }
}
