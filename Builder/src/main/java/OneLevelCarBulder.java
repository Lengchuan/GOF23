/**
 * @description
 * @authoor lengchuan
 * @date 16-6-2
 */
public class OneLevelCarBulder implements CarBuilder{
    public Engine buildEngine() {
        System.out.println("构建一级发动机");
        return new Engine("一级发动机");
    }

    public Chair buildChair() {
        System.out.println("构建一级座椅");
        return new Chair("一级座椅");
    }

    public Trye buildTrye() {
        System.out.println("构建一级轮胎");
        return new Trye("构建一级轮胎");
    }
}
