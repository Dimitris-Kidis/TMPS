package com.company;

// REAL SERVICE

public class RealProject implements AppDatabase{
    private String db;

    public RealProject(String db) {
        this.db = db;
        load();
    }

    public void load() {
        System.out.println("Loading data from " + db + " Database...");
    }

    @Override
    public void run() {
        System.out.println("Running data from " + db + " Database...");
    }
}
