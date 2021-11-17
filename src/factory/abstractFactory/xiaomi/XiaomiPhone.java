package factory.abstractFactory.xiaomi;

import factory.abstractFactory.product.IphoneProduct;

/**
 * @ClassName develop-XiaomiPhone
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年8月27日20:24 - 周五
 * @Theme
 */
public class XiaomiPhone implements IphoneProduct {

    @Override
    public void start() {
        System.out.println("打开小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void callup() {
        System.out.println("利用小米打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("利用小米发信息");
    }
}
