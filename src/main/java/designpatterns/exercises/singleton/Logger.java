package designpatterns.exercises.singleton;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Logger {
    // TODO implement as singleton

    private static Logger INSTANCE;

    private Logger(){}

    public static synchronized Logger getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    private static final List<String> log = new ArrayList<>();

    public static void error (String message){
        message = "error: " + message;
        System.out.println(message);
        log.add(message);
    }

    public static void warn (String message){
        message = "warn: " + message;
        System.out.println(message);
        log.add(message);

    }

    public static void info (String message){
        message = "info: " + message;
        System.out.println( message);
        log.add(message);
    }

    public static void setLogToFile (String filename){


        File file = new File("C:\\Users\\Michał\\Desktop\\" + filename + ".txt");

        try (
                PrintWriter p = new PrintWriter(new FileOutputStream(file, true)))
        {
            for (String l : log) {
                p.println(l);
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }




    }


}
