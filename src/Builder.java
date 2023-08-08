import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Builder {
    public static void builder(String log, String fileName, String directory) {
        try {
            FileWriter writer = new FileWriter(directory + fileName);
            writer.write(log.toString());
            writer.close();
            System.out.println("Log  Успешно записан ");
        } catch (IOException e) {
            System.out.println("Ошибка при создании лога " + e.getMessage());
        }
    }
}
