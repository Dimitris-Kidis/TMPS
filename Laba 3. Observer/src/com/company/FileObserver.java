package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

// Observer

public class FileObserver implements Observer{
    @Override
    public void handleEvent(int temp, int pressure) {
        File f;
        File path = new File("/Users/dimitriskidis/IdeaProjects");
        try {
            f = File.createTempFile("TempPressure", ".txt", path);
            PrintWriter pw = new PrintWriter(f);
            pw.print("Погода изменилась. t = " + temp + "deg" + ", p = " + pressure + ".");
            pw.println();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
