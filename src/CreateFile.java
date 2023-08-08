import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static StringBuilder createFiles(String directory, String[] fileName) {
        StringBuilder log = new StringBuilder();
        for (String folder : fileName) {
            File dir = new File(directory + folder);
            try {
                if (!dir.exists())
                    if (dir.createNewFile()) {
                        System.out.println("Файл " + folder + " Создан");
                        log.append(folder + " create \n");

                    }
            } catch (IOException ex) {
                System.out.println("Ошибка при создании папки " + folder + ": " + ex.getMessage());
            }
        }
        return log;
    }

    public static StringBuilder createFiles(String directory, String fileName) {
        StringBuilder log = new StringBuilder();
        String[] folders = fileName.split(",");
        for (String folder : folders) {
            File dir = new File(directory + folder);
            try {
                if (!dir.exists())
                    if (dir.createNewFile()) {
                        System.out.println("Файл " + folder + " Создан");
                        log.append(folder + " create \n");

                    }
            } catch (IOException ex) {
                System.out.println("Ошибка при создании папки " + folder + ": " + ex.getMessage());
            }
        }
        return log;
    }
}



