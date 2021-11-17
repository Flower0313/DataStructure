package proxy.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName BinaryTree-DynamicProxyHandler
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月14日21:15 - 周二
 * @Describe
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Object object;

    public DynamicProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买房前准备");
        Object result = method.invoke(object,args);
        System.out.println("买房后装修");
        return result;
    }
}
