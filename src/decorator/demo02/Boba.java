package decorator.demo02;

/**
 * @ClassName BinaryTree-Boba
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月14日9:44 - 周二
 * @Describe 调料的实现类
 */
public class Boba extends ToppingDecorator {
    private final Beverage beverage;

    public Boba(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 2 + beverage.cost();
    }
}
