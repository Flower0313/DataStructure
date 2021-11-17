package factory.SimapleFactory;

/**
 * @ClassName develop-CarFactory
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年8月27日19:54 - 周五
 * @Theme
 */
public class CarFactory {
    private static final String WULING = "五菱宏光";
    private static final String TESLA = "特斯拉";

    /**
     * 方法一
     * 假设再增加一个品牌的话，在工厂也需要增加。
     * @param car
     * @return new一个对象
     */
    public static Car getCar(String car) {
        if (WULING.equals(car)) {
            return new WuLing();
        } else if (TESLA.equals(car)) {
            return new Tesla();
        }else{
            return null;
        }
    }

    /**
     * 方法二：也需要新增，改变工厂类，不方便
     * @return
     */
    public static Car getWuLing(){
        return new WuLing();
    }
}
