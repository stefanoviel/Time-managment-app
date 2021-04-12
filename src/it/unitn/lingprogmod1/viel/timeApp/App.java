package it.unitn.lingprogmod1.viel.timeApp;

import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class App {
    String name = "Default name";
    float time_today = 0;
    float productivity = 0;
    BufferedImage icon;

    public App(String n){
        name = n;
        String url = name + ".png";

        try{
            icon = ImageIO.read(new File(url));
        }catch (IOException e){
            String workingDir = System.getProperty("user.dir");
            System.out.println("Current working directory : " + workingDir);
            e.printStackTrace();
        }

    }

    String[] get_data(){
        String[] arr = {name, String.valueOf(time_today)};
        return arr;
    }


}
