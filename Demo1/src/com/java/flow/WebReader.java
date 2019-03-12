package com.java.flow;

import javax.swing.*;
import java.net.*;
import java.io.*;

/**
 * Created by viruser on 2018/9/5.
 */
public class WebReader  extends JFrame{
    JTextArea box = new JTextArea("Getting data");

    public WebReader(){
        super("Get File Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,300);
        JScrollPane pane = new JScrollPane(box);
        add(pane);
        setVisible(true);
    }

    void getData(String address) throws MalformedURLException{
        setTitle(address);
        URL page = new URL(address);
        StringBuilder text = new StringBuilder();
        try {
            HttpURLConnection conn = (HttpURLConnection) page.openConnection();
            conn.connect();
            InputStreamReader in = new InputStreamReader( (InputStream) conn.getContent());
            BufferedReader buff  = new BufferedReader(in);
            box.setText("Getting data");
            String line;
            do {
                line = buff.readLine();
                text.append(line);
                text.append("\n");
               // System.out.println(text);
            } while (line != null);
            box.setText(text.toString());
        } catch (IOException ioe) {
            System.out.println("IO Error :" + ioe.getMessage());
        }
    }

    public static void main(String[] arguments) {
        String[] args = {"https://www.baidu.com"};
        if(args.length < 1) {
            System.out.println("Usage :java WebReader url");
            System.exit(1);
        }
        try {
            WebReader app = new WebReader();
            app.getData(args[0]);
        } catch (MalformedURLException mue) {
            System.out.println("Bad URL : " +  args[0]);
        }
    }
}
