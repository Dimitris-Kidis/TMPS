package com.company;

// PROXY SERVICE

public class ProxyProject implements AppDatabase{
    private String db;
    private RealProject realProject;

    public ProxyProject(String db) {
        this.db = db;
    }

    @Override
    public void run() {
        if (realProject == null) {
            realProject = new RealProject(db);
        }
        realProject.run();
    }
}
