package observer.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BinaryTree-WechatServer
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月15日22:44 - 周三
 * @Describe 微信相当于被观察者，只要它有变动，那么观察它的用户（也就是使用者）也会收到消息。
 */
public class WechatServer implements Subject{
    //定义观察者列表
    private List<Observer> users;
    private String message;

    public WechatServer() {
        //懒汉式加载
        users = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        //添加观察我的用户
        users.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        //移除观察我的用户
        if (!users.isEmpty()) {
            users.remove(o);
        }
    }

    public void setInfomation(String s) {
        //初始化传输内容
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        // 消息更新，通知所有观察者
        notifyObserver();
    }

    //实际通知方法
    @Override
    public void notifyObserver() {
        for (Observer o : users) {
            o.update(message);
        }
    }
}
