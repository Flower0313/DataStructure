package factory.abstractFactory.xiaomi;

import factory.abstractFactory.product.IRouterProduct;

/**
 * @ClassName develop-XiaomiRouter
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年8月27日20:28 - 周五
 * @Theme
 */
public class XiaomiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("小米路由器开机");
    }

    @Override
    public void openWiFi() {
        System.out.println("小米路由器开wifi");
    }

    @Override
    public void setting() {
        System.out.println("小米路由器在设置");
    }

    @Override
    public void shutdown() {
        System.out.println("小米路由器关机");
    }
}
