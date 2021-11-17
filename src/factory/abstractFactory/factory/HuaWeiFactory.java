package factory.abstractFactory.factory;

import factory.abstractFactory.product.IRouterProduct;
import factory.abstractFactory.product.IphoneProduct;
import factory.abstractFactory.huawei.HuaWeiPhone;
import factory.abstractFactory.huawei.HuaWeiRouter;

/**
 * @ClassName develop-HuaWeiFactory
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年8月27日20:42 - 周五
 * @Theme
 */
//华为工厂，用来生产手机和路由器
public class HuaWeiFactory implements IProductFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaWeiPhone();
    }

    @Override
    public IRouterProduct iRouterProduct() {
        return new HuaWeiRouter();
    }
}
