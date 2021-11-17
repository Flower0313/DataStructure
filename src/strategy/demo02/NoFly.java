package strategy.demo02;

/**
 * @ClassName BinaryTree-NoFly
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月11日22:56 - 周六
 * @Theme 若要新增不会飞的类，只要FlyBehavior接口的方法就行
 */
public class NoFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
