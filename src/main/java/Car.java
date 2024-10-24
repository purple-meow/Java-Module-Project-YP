public class Car {
    String name;
    int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public int distance(){
        return speed * 24;
    }

    public String getName(){
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}
