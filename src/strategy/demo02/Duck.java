package strategy.demo02;

/**
 * @ClassName BinaryTree-Duck
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月11日22:57 - 周六
 * @Theme 相当于上下文类Context，连接飞翔接口和子类
 */
public abstract class Duck {
    //属性：策略接口
    FlyBehavior flyBehavior;

    public Duck() {
    }

    public void willfly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

}
