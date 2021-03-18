package pfsystem.utils;

import java.io.File;

public class DataBaseCreator {

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

    public void createFile(String path){

    }
}
