package ClassAndObjects.BoxingGame;

public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;
    boolean select;
    int point = 1;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void run() {
        if (checkWeight()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                if (startFighter()) {
                    System.out.println("==============="+point+" ROUND================");
                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    printScore();
                }else if (!startFighter()){
                    System.out.println("==============="+point+" ROUND================");
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    printScore();
                }
                point++;
            }
        } else {
            System.out.println("Sporcuların sikletleri eşit değildir.");
        }
    }

    boolean checkWeight() {
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    boolean isWin() {
        if (f1.health == 0) {
            System.out.println("\nMAÇI KAZANAN : " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("\nMAÇI KAZANAN : " + f1.name);
            return true;
        }
        return false;
    }

    void printScore() {
        System.out.println("---------------------");
        System.out.println(f1.name + " Kalan Can\t:" + f1.health);
        System.out.println(f2.name + " Kalan Can\t:" + f2.health);
    }

    boolean startFighter(){
        select = Math.random()*2 <= 1;
        return select;
    }
}
