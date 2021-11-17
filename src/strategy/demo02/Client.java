package strategy.demo02;

/**
 * @ClassName BinaryTree-Client
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月11日23:06 - 周六
 * @Theme
 */
public class Client {
    public static void main(String[] args) {
        Duck duck = new WildDuck();
        duck.willfly();

        duck = new PekingDuck();
        duck.willfly();
        //动态的改变北京鸭会飞
        duck.setFlyBehavior(new GoodFly());
        duck.willfly();

        //用接口的匿名对象来创建
        /*FlyBehavior flyBehavior = new FlyBehavior() {
            @Override
            public void fly() {
                System.out.println("随便飞~~");
            }
        };
        flyBehavior.fly();*/
    }
}
