/**
 * @description
 * @authoor lengchuan
 * @date 16-6-2
 */
public class Car {

    /**
     * 发动机
     */
    private Engine engine;

    /**
     * 座椅
     */
    private Chair chair;

    /**
     * 轮胎
     */
    private Trye trye;


    public Engine getEngine() {
        return engine;
    }

    public void run(){
        System.out.println("Car running！");
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public Trye getTrye() {
        return trye;
    }

    public void setTrye(Trye trye) {
        this.trye = trye;
    }
}
