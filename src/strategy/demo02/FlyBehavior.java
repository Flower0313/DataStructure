package strategy.demo02;

/**
 * @ClassName BinaryTree-FlyBehavior
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月11日22:54 - 周六
 * @Theme 因为不同的鸭子对飞翔有不同的状态，所以可以抽象一个飞翔接口
 */
public interface FlyBehavior {
    void fly();//需要子类具体实现
}
