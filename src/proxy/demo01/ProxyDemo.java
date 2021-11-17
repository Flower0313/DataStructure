package proxy.demo01;

/**
 * @ClassName BinaryTree-ProxyDemo
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月14日20:21 - 周二
 * @Describe
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new RealImage("肖华");
        Image image2 = new ProxyImage("flower");

        image.display();
        System.out.println("");
        image2.display();
    }
}
