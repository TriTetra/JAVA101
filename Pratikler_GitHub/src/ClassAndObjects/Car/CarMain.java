package ClassAndObjects.Car;

public class CarMain {
    public static void main(String[] args) {

        Car audi = new Car("Auid", "White", 150);
        audi.printInfo();

        Car bmw = new Car("BMW", "Black", 180);
        bmw.printInfo();

        Car mercedes = new Car("Mercedes", "Blue", 230);
        mercedes.printInfo();


        /*Car audi = new Car();
        audi.model = "Audi";
        audi.speed = 160;
        audi.color = "White";
        audi.increaseSpeed(20);
        //System.out.println("-> "+audi.model + " Hızı : "+audi.speed+" ve Rengi : "+audi.color);
        audi.printSpeed();

        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.speed = 240;
        bmw.color = "Black";
        bmw.decreaseSpeed(20);
        //System.out.println("-> "+bmw.model + " Hızı : "+bmw.speed+" ve Rengi : "+bmw.color);
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.model = "Mercedes";
        mercedes.speed = 260;
        mercedes.color = "Gold";
        //System.out.println("-> "+mercedes.model + " Hızı : "+mercedes.speed+" ve Rengi : "+mercedes.color);
        mercedes.printSpeed();*/
    }
}
