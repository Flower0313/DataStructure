package strategy.demo01;

/**
 * @ClassName BinaryTree-OpreationAdd
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月11日22:20 - 周六
 * @Theme
 */
public class OpreationAdd implements Strategy {
    @Override
    public int deOpreation(int num1, int num2) {
        System.out.println("执行加法：");
        return num1 + num2;
    }
}
