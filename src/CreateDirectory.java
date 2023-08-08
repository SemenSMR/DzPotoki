import java.io.File;

public class CreateDirectory {
    public static StringBuilder createDirectory(String directory, String[] folderName) {
        StringBuilder log = new StringBuilder();
        for (String folder : folderName) {
            File dir = new File(directory + folder);
            if (!dir.exists()) {
                if (dir.mkdir()) {
                    System.out.println("Папка " + folder + " создана");
                    log.append(folder + " create \n");
                } else {
                    System.out.println("Папка " + folder + " не создана");
                }
            }
        }
        return log;
    }
}




