package ClassAndObjects.BoxingGame;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ahmet Koyuncu",7,100,100,5);
        Fighter f2 = new Fighter("Kamil Şenol",5,100,100,7);

        Match match = new Match(f1,f2,90,110);
        match.run();
    }
}
