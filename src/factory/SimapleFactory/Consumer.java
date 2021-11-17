package factory.SimapleFactory;

/**
 * @ClassName develop-Consumer
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年8月27日19:52 - 周五
 * @Theme
 */
public class Consumer {
    public static void main(String[] args) {
        Car car = CarFactory.getCar("五菱宏光");
        car.name();
    }
}
