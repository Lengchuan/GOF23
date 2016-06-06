/**
 * @description
 * @authoor lengchuan
 * @date 16-6-2
 */
public class OneLevelCarDirector implements CarDirector{

    private  CarBuilder carBuilder;

    public OneLevelCarDirector(CarBuilder carBuilder) {

        this.carBuilder = carBuilder;
    }

    /**
     * 组装
     *
     * @return
     */
    public Car directorCar() {
        Car car = new Car();
        Engine engine = carBuilder.buildEngine();
        Chair chair = carBuilder.buildChair();
        Trye trye = carBuilder.buildTrye();
        car.setEngine(engine);
        car.setChair(chair);
        car.setTrye(trye);
        return car;
    }
}
