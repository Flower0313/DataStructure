package factory.abstractFactory.huawei;

import factory.abstractFactory.product.IphoneProduct;

/**
 * @ClassName develop-HuaWeiPhone
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年8月27日20:26 - 周五
 * @Theme
 */
public class HuaWeiPhone implements IphoneProduct {
    @Override
    public void start() {
        System.out.println("华为手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为手机关机");
    }

    @Override
    public void callup() {
        System.out.println("华为正在打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("华为正在发信息");
    }
}
