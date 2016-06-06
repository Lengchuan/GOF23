/**
 * @description
 * @authoor lengchuan
 * @date 16-6-2
 */
public class BuilderTest1 {
    public static void main(String[] args) {

        CarDirector carDirector = new OneLevelCarDirector(new OneLevelCarBulder());
        Car car = carDirector.directorCar();
        System.out.println(car.getChair().getName());
        car.run();
    }
}
