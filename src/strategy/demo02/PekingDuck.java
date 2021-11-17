package strategy.demo02;

/**
 * @ClassName BinaryTree-PekingDuck
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月11日23:04 - 周六
 * @Theme
 */
public class PekingDuck extends Duck{
    //构造器中完成赋值
    public PekingDuck(){
        flyBehavior = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("北京鸭");
    }
}
