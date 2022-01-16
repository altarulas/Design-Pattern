public class Main {

    public static void main(String[] args) {

        System.out.println("Song List Every Song Available\n");

        MusicComponent group1 = new MusicGroup("Take the A Train","Duke Ellington", "1940");
        MusicComponent group2 = new MusicGroup("So What","Miles Davis","1959");

        MusicComponent group3 = new MusicGroup("When The Sun Goes Down","Arctic Monkeys","2006");
        MusicComponent group4 = new MusicGroup("Obstacle 1","Interpol","2002");

        MusicComponent group5 = new MusicGroup("No Diggty","BlackStreet","1996");
        MusicComponent group6 = new MusicGroup("Can't Feel My Face","Weekend","2015");

        MusicComponent musicComponent1 = new MusicType("Jazz is a music genre that...");
        MusicComponent musicComponent2 = new MusicType("Indie rock is a genre of rock music that...");
        MusicComponent musicComponent3 = new MusicType("R&B [Rhythm and blues] is a genre of popular...");


        musicComponent1.add(group1);
        musicComponent1.add(group2);

        musicComponent2.add(group3);
        musicComponent2.add(group4);

        musicComponent3.add(group5);
        musicComponent3.add(group6);


        musicComponent1.print();
        musicComponent2.print();
        musicComponent3.print();



    }

}
