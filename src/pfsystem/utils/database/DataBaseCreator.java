package pfsystem.utils.database;

import pfsystem.utils.constants.Constants;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class DataBaseCreator {

    public static void createInitFiles(){
        createMainDir();
        createSubDir(Constants.p_mainPath,"User");
        createSubDir(Constants.p_mainPath + "/User", "Card");
    }

    private static void createMainDir(){
        File directory = new File(Constants.p_mainPath);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    public static String createSubDir(String path, String name){
        File directory = new File(path + "/" + name);
        if (!directory.exists()) {
            directory.mkdir();
        }
        return directory.getAbsolutePath();
    }

    public static void createFile(String path, String fileName, String content){
        File file = new File(path + "/" + fileName);
        if (!file.exists()) {
            try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8))) {
                writer.write(content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
