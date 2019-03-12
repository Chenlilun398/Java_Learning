package com.java.flow;

import java.nio.file.*;
import java.io.*;

public class Allcaps {
    String sourceName;

    Allcaps(String sourceArg) {
        sourceName = sourceArg;
    }

    void convert() {
        try {
            FileSystem fs = FileSystems.getDefault();
            System.out.println(fs);
            Path source = fs.getPath(sourceName);
            System.out.println(source);
            System.out.println(sourceName);
            Path temp = fs.getPath(sourceName);
            System.out.println(temp);

            FileReader fr = new FileReader(source.toFile());
            BufferedReader in = new BufferedReader(fr);

            FileWriter fw = new FileWriter(temp.toFile());
            BufferedWriter out = new BufferedWriter(fw);

            boolean eof = false;
            int inChar;

            do{
                inChar = in.read();
                if (inChar != -1) {
                    char outChar = Character.toUpperCase( (char) inChar);
                    out.write(outChar);
                } else
                    eof = true;
            }while (!eof);
            in.close();
            out.close();

            Files.delete(source);
            Files.move(temp,source);
        } catch (IOException se) {
            System.out.println("Error --" + se.getMessage());
        }
    }
}
