package com.company;

public class Main {

    public static void main(String[] args) {
	    SavePlace place1 = new DataSaver(new Folder("/Users/dima/main"));
        SavePlace place2 = new DataSaver(new TxtFile("file.txt"));
        SavePlace place3 = new DataSaver(new Repository("github.com/Dimitris-Kidis/TMPS"));

        place1.getPlace();
        System.out.println("------------------------------");
        place2.getPlace();
        System.out.println("------------------------------");
        place3.getPlace();
    }
}
