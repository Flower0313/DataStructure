package factory.abstractFactory;

import factory.abstractFactory.factory.IProductFactory;
import factory.abstractFactory.product.IphoneProduct;
import factory.abstractFactory.factory.XiaomiFactory;
import org.junit.Test;

/**
 * @ClassName develop-Test
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年8月27日21:04 - 周五
 * @Theme
 */
public class FactoryTest {
    @Test
    public void test01(){
        IProductFactory xiaomiFactory = new XiaomiFactory();
        IphoneProduct mi = xiaomiFactory.iphoneProduct();
        mi.start();
    }
}
