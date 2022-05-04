package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    static StringBuilder text;
    public static void main(String[] args) throws FileNotFoundException {
        String input = "/Users/dimitriskidis/IdeaProjects/TsoftLaba4/src/InitialData.txt";
        System.out.println();
        String output = "/Users/dimitriskidis/IdeaProjects/TsoftLaba4/src/Output.txt";


        try(FileWriter writer = new FileWriter(output, true))
        {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();

        try (FileReader reader = new FileReader(input)) {
            int c;
            StringBuilder getLine = new StringBuilder();
            while ((c=reader.read()) != -1) {
                getLine.append((char) c);
            }

            ArrayList<Integer> keys = new ArrayList<Integer>();
            ArrayList<String> words = new ArrayList<String>();
            ArrayList<String> others = new ArrayList<String>();

            String[] items = getLine.toString().split("\n");
            int inc = 0;
            while ( inc != items.length) {
                try {
                    keys.add(Integer.parseInt(items[inc]));
                } catch (Exception ex) {
                    others.add(items[inc]);
                    keys.add(999);
                }
                inc++;
                words.add(items[inc]);
                inc++;
            }
            Cipher cipher = new Cipher();

            int count = 0;
            for (int i = 0; i < keys.size(); i++) {
                text = new StringBuilder();
                text.append(formatter.format(date));
                if ( keys.get(i) == 999 ) {
                    text.append(" " + (i+1) + ". Key = " + others.get(count) + ". Word = " + words.get(i) + ". ");
                    count++;
                } else {
                    text.append(" " + (i+1) + ". Key = " + keys.get(i) + ". Word = " + words.get(i) + ". ");
                }

                writer.write(text.toString());
                writer.flush();
                cipher.calculate(keys.get(i), words.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
