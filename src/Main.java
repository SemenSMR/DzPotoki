import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GameProgress progress = new GameProgress(65, 234, 15, 345.21);
        GameProgress progress2 = new GameProgress(45, 235, 16, 234.2);
        GameProgress progress3 = new GameProgress(1, 12, 58, 123.1);
        StringBuilder log = new StringBuilder();
        String directory = "C:/Users/it-personal1/Desktop/code-wards/8kyu/DzPotoki/src/Games/";
        String directory2 = "C:/Users/it-personal1/Desktop/code-wards/8kyu/DzPotoki/src/Games/src/";
        String directory3 = "C:/Users/it-personal1/Desktop/code-wards/8kyu/DzPotoki/src/Games/src/main/";
        String directory4 = "C:/Users/it-personal1/Desktop/code-wards/8kyu/DzPotoki/src/Games/res/";
        String directory5 = "C:/Users/it-personal1/Desktop/code-wards/8kyu/DzPotoki/src/Games/temp/";
        String directory6 = "C:/Users/it-personal1/Desktop/code-wards/8kyu/DzPotoki/src/Games/savegames/save3.dat";
        String directory7 = "C:/Users/it-personal1/Desktop/code-wards/8kyu/DzPotoki/src/Games/savegames/Zip.zip/";

        String[] folderName = {"src", "res", "savegames", "temp"};
        String[] folderName2 = {"main", "test"};
        String[] fileName = {"Main.java", "Utils.java"};
        String[] folderName3 = {"drawables", "vectors", "icons"};
        String fileName2 = "temp.txt";

        log.append(CreateDirectory.createDirectory(directory, folderName));
        log.append(CreateDirectory.createDirectory(directory2, folderName2));
        log.append(CreateFile.createFiles(directory3, fileName));
        log.append(CreateDirectory.createDirectory(directory4, folderName3));
        log.append(CreateFile.createFiles(directory5, fileName2));
        Builder.builder(String.valueOf(log), fileName2, directory5);

        GameProgress.saveGame(directory6, progress);
        GameProgress.ZipFile(directory7, directory6);
    }
}

