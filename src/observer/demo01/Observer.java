package observer.demo01;

/**
 * @ClassName BinaryTree-Observer
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月15日22:09 - 周三
 * @Describe 抽象观察者，观察者将对观察目标的改变做出反应
 */
public interface Observer {
    public String getName();

    public void setName(String name);

    public void help();//声明支援盟友方法

    public void beAttacked(AllyControlCenter acc);//声明遭受攻击方法
}

class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    //支援盟友方法的实现
    @Override
    public void help() {
        System.out.println("坚持住，" + this.name + "来救你！");
    }

    //遭受攻击方法实现，当受攻击时会调用战队控制中心的通知方法notifyObserver()来通知朋友
    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name+"被攻击！");
        acc.notifyObserver(name);
    }
}
