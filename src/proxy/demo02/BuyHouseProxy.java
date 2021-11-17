package proxy.demo02;

/**
 * @ClassName BinaryTree-BuyHouseProxy
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月14日21:11 - 周二
 * @Describe
 */
public class BuyHouseProxy implements BuyHouse{
    private BuyHouse buyHouse;

    public BuyHouseProxy(final BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        System.out.println("买房前准备");
        buyHouse.buyHouse();
        System.out.println("买房后装修");
    }
}
