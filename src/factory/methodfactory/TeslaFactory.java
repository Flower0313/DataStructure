package factory.methodfactory;


/**
 * @ClassName develop-TeslaFactory
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年8月27日20:07 - 周五
 * @Theme
 */
public class TeslaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
