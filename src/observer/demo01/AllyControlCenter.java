package observer.demo01;

import java.util.ArrayList;

/**
 * @ClassName BinaryTree-AllyControlCenter
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月15日22:16 - 周三
 * @Describe
 */
public abstract class AllyControlCenter {
    protected String allyName;//战队名称

    protected ArrayList<Observer> players = new ArrayList<>();//定义一个集合用于存储战队成员

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public String getAllyName() {
        return this.allyName;
    }

    //注册方法
    public void join(Observer obs) {
        System.out.println(obs.getName() + "加入" + this.allyName + "战队！");
        players.add(obs);
    }

    //注销方法
    public void quit(Observer obs) {
        System.out.println(obs.getName() + "退出" + this.allyName + "战队！");
        players.remove(obs);
    }

    //声明通知方法
    public abstract void notifyObserver(String name);
}


//具体战队控制中心类，具体目标类
class ConcreteAllyControlCenter extends AllyControlCenter {
    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "组件战队成功");
        System.out.println("---------------------");
        this.allyName = allyName;
    }

    //实现通知方法
    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");
        //遍历观察者集合，调用每一个盟友（除了自己）的志愿方法
        for (Observer obs : players) {
            if(!(obs.getName().equalsIgnoreCase(name))){
                obs.help();
            }
        }
    }
}
