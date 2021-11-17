package factory.abstractFactory.huawei;

import factory.abstractFactory.product.IRouterProduct;

/**
 * @ClassName develop-HuaWeiRouter
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年8月27日20:28 - 周五
 * @Theme
 */
public class HuaWeiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("华为路由器开机");
    }

    @Override
    public void openWiFi() {
        System.out.println("华为路由器开wifi");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器在设置");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器关机");
    }
}
