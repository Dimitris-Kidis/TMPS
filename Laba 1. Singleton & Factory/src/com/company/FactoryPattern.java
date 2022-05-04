package com.company;

public class FactoryPattern {
    public static class Person {
        public String name;
        public int age;
        public String job;
        private String[] jobList = {
                "Programer",
                "Teacher",
                "Nurse",
                "Dentist",
                "Actor",
                "Pilot",
                "Engineer",
                "Writer",
                "Architect",
                "Lawyer",
                "Tax Driver",
                "Designer",
                "Researcher",
                "Plumber"};



        public Person () {
            this.age = (int)(20 + Math.random() * 20);
            this.job = jobList[(int)(Math.random() * jobList.length)];

        }

        @Override
        public String toString() {
            return this.name + "(" + this.job + "), " + this.age;
        }



        public void setName (String name) {
            this.name = name;
        }


        public void LooksFor(){
            // ищет партнера
            System.out.println("В поиске партнера..");
        }
    }

    public static class Woman extends Person {
        public String name;
        private String[] womanNames = {
                "Natashka",
                "Lariska",
                "Raya",
                "Snezhana",
                "Violeta",
                "Doina",
                "Viorica",
                "Angela",
                "Sarah",
                "Jennifer",
                "Olga",
                "Samantha",
                "Dina",
                "Nadya",
                "Lucia",
                "Sveta",
                "Oxana"};


        public Woman () {
            this.name = womanNames[(int)(Math.random() * womanNames.length)];
            setName(this.name);
        }


    }


    public static class Man extends Person {
        public String name;
        private String[] manNames = {
                "Viorel",
                "Tudor",
                "Radu",
                "Sandu",
                "Marcel",
                "Italian",
                "Florin",
                "Gheocel",
                "Vadim",
                "Nicolae",
                "Nichita",
                "Alexander",
                "Dima",
                "Eric",
                "Maxim",
                "Leonid",
                "Alexei"};

        public Man () {
            this.name = manNames[(int)(Math.random() * manNames.length)];
            setName(this.name);
        }

    }



}
