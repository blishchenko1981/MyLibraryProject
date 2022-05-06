package com.cydeo.utility;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();


    static{
        try {
            FileInputStream file = new FileInputStream("config.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("Properties File not found");
        }
    }


    public static String read(String keyWord){
        return properties.getProperty(keyWord);
    }



    @Test
    public void testReadingProperties(){


        Properties properies = new Properties();

        try{
        FileInputStream in = new FileInputStream("configuration.properties");
        properies.load(in);
        in.close();
        }catch (IOException e ){
            e.printStackTrace();
        }

     String name =    properies.getProperty("name1");

        System.out.println("name = " + name);

        String urlGoogle = properies.getProperty("url");
        System.out.println("urlGoogle = " + urlGoogle);
    }

}
