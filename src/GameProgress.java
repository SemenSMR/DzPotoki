import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class GameProgress implements Serializable {
    private static final long serialVersionUID = 63457236322125L;

    private int health;
    private int weapons;
    private int lvl;
    private double distance;

    public GameProgress(int health, int weapons, int lvl, double distance) {
        this.health = health;
        this.weapons = weapons;
        this.lvl = lvl;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "GameProgress{" +
                "health=" + health +
                ", weapons=" + weapons +
                ", lvl=" + lvl +
                ", distance=" + distance +
                '}';
    }

    public static void saveGame(String directory, GameProgress gameProgress) {
        try (FileOutputStream fos = new FileOutputStream(directory);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(gameProgress);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void ZipFile(String directoryZip, String directoryFile) {
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(directoryZip));
             FileInputStream fis = new FileInputStream(directoryFile)) {
            ZipEntry entry = new ZipEntry("save3.dat");
            zout.putNextEntry(entry);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                zout.write(buffer, 0, bytesRead);
            }
            zout.closeEntry();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

         try {   File fileToDelete = new File(directoryFile);
            if (fileToDelete.exists()) {
                if (fileToDelete.delete()) {
                    System.out.println("Файл успешно удален: " + directoryFile);
                } else {
                    System.out.println("Не удалось удалить файл: " + directoryFile);
                }
            } else {
                System.out.println("Файл не найден: " + directoryFile);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}



