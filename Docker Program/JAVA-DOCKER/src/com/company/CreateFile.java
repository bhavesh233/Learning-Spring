package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateFile {

    public static void main(String[] args) {

        Date date = new Date();
        Format formatter = new SimpleDateFormat("HH:mm:ss");
        String data = "Time is "+formatter.format(date)+" ------- \n";

        try {
            Files.write(Paths.get("/home/output.txt"), data.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("success");
        } catch (IOException e) {
            e.printStackTrace();

        }

        for (int i = 0; i < 50000; i++) {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(i);

        }


    }

}
