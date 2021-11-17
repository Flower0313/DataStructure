package factory.methodfactory;

import factory.SimapleFactory.CarFactory;

/**
 * @ClassName develop-Consumer
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年8月27日19:52 - 周五
 * @Theme 用这种设计模式就符合了开闭原则，比如再新增一个品牌汽车，就只需要新增它和它的工厂，不需要再动别的类代码
 */
public class Consumer {
    public static void main(String[] args) {
        Car car1 = new TeslaFactory().getCar();
        Car car2= new WuLingFactory().getCar();
    }
}
