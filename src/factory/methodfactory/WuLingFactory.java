package factory.methodfactory;

/**
 * @ClassName develop-WuLingFactory
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年8月27日20:08 - 周五
 * @Theme
 */
public class WuLingFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
