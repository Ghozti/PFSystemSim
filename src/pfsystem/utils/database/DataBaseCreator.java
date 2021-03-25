package pfsystem.utils.database;

import pfsystem.utils.constants.Constants;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class DataBaseCreator {

    //this method will create the initial files (this method is called in Main)
    public static void createInitFiles(){
        createMainDir();
        createSubDir(Constants.p_mainPath,"User");
        createSubDir(Constants.p_mainPath + "/User", "Card");
    }

    //will create the main directory (PFsystem) in the user's home directory.
    private static void createMainDir(){
        File directory = new File(Constants.p_mainPath);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    //this method can be used to create a sub directory
    public static String createSubDir(String path, String name){
        File directory = new File(path + "/" + name);
        if (!directory.exists()) {
            directory.mkdir();
        }
        return directory.getAbsolutePath();
    }

    //this method can be used to create a file
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

    //this method can be used to write ona  file
    public static void writeFile(File directory, String text) throws FileNotFoundException {
        if (!directory.exists()) {
            try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(directory), "utf-8"))) {
                writer.write(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getFileText(String path){
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
