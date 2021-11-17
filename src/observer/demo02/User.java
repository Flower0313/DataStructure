package observer.demo02;

/**
 * @ClassName BinaryTree-User
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月15日22:45 - 周三
 * @Describe 定义被观察者，实现了Observer接口，对接口的三个方法进行了具体实现，同时又一个List集合，用以保存注册的观察者
 * 等需要通知观察者时，遍历集合
 */
public class User implements Observer{
    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    //实际执行类
    public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }
}
