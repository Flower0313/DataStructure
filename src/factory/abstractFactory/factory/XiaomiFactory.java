package factory.abstractFactory.factory;

import factory.abstractFactory.product.IRouterProduct;
import factory.abstractFactory.product.IphoneProduct;
import factory.abstractFactory.xiaomi.XiaomiPhone;
import factory.abstractFactory.xiaomi.XiaomiRouter;

/**
 * @ClassName develop-XiaomiFactory
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年8月27日20:40 - 周五
 * @Theme
 */

//小米工厂，用来生产手机和路由器
public class XiaomiFactory implements IProductFactory {

    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct iRouterProduct() {
        return new XiaomiRouter();
    }
}
