package factory.abstractFactory.factory;

import factory.abstractFactory.product.IRouterProduct;
import factory.abstractFactory.product.IphoneProduct;

/**
 * @ClassName develop-IProductFactory
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年8月27日20:38 - 周五
 * @Theme
 */

//抽象工厂类，来管控工厂生产什么，工厂的工厂,这里声明的都是产品的父接口
public interface IProductFactory {
    //生产手机
    IphoneProduct iphoneProduct();
    //生产路由器
    IRouterProduct iRouterProduct();
}
