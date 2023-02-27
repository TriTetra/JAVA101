package ClassAndObjects.Car;

public class Car {
    String model;
    String type;
    String color;
    int speed;
    int speedLimit;

    Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.type = "Sedan";
        this.speedLimit = 250;
    }

    void increaseSpeed(int increment) {
        if ((this.speed + increment) < this.speedLimit) {
            this.speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if (this.speed > 0) {
            this.speed -= decrease;
        }
    }

    void printSpeed() {
        System.out.println("-> " + model + " | Hızınız : " + speed + " | Rengi : " + color);
    }

    void printInfo() {
        System.out.println("=======================");
        System.out.println("Model :\t" + this.model);
        System.out.println("Color :\t" + this.color);
        System.out.println("Type  :\t" + this.type);
        System.out.println("Speed :\t" + this.speed);
    }
}
