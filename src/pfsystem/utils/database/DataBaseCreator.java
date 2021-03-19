package pfsystem.utils.database;

import java.io.*;

public class DataBaseCreator {

    public void createInitFiles(){
        createMainDir();
        createSubDir("User");
    }

    public void createMainDir(){
        File directory = new File(System.getProperty("user.home") + "/PFSystem");
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    public String createSubDir(String name){
        File directory = new File(System.getProperty("user.home") + "/PFSystem/" + name);
        if (!directory.exists()) {
            directory.mkdir();
        }
        return directory.getAbsolutePath();
    }

    public void createFile(String path, String fileName, String content){
        File file = new File(path + "/" + fileName);
        if (!file.exists()) {
            try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "utf-8"))) {
                writer.write(content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
