 public class CarTest {
    public static void main(String[] args) {
    Car car = new Car(1991, "Ford");


        car.setMake("Toyota");
        car.setSpeed(0);
        car.setYearModel(1989);

        System.out.println("Car year:"+car.getYearModel());
        System.out.println("Car model: "+ car.getMake());
        System.out.println("Current speed: "+ car.getSpeed());
        car.accelerate();//call accelerate method
        System.out.println("Current speed: "+ car.getSpeed());
        car.brake();//call brake method
        System.out.println("Current speed: "+ car.getSpeed());
    }
}
