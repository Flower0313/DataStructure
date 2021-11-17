package decorator.demo02;

/**
 * @ClassName BinaryTree-Pudding
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月14日9:42 - 周二
 * @Describe 调料实现类
 */
public class Pudding extends ToppingDecorator {
    private final Beverage beverage;

    public Pudding(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 3 + beverage.cost();
    }
}
