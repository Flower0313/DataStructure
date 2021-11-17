package proxy.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ClassName BinaryTree-ProxyTest
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月14日21:17 - 周二
 * @Describe
 */
public class ProxyTest {
    public static void main(String[] args) {
        //静态代理
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHouse();

        //动态代理
        BuyHouse buyHouse1 = new BuyHouseImpl();
        InvocationHandler handler = new DynamicProxyHandler(buyHouse1);
        BuyHouse proxyBuy = (BuyHouse) Proxy.newProxyInstance(buyHouse1.getClass().getClassLoader(),
                buyHouse1.getClass().getInterfaces(),handler);
        proxyBuy.buyHouse();
    }
}
