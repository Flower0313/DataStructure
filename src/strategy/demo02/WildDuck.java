package strategy.demo02;

/**
 * @ClassName BinaryTree-WildDuck
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月11日22:59 - 周六
 * @Theme
 */
public class WildDuck extends Duck{
    public WildDuck(){
        flyBehavior = new GoodFly();
    }

    @Override
    public void display() {
        System.out.println("野鸭");
    }
}
