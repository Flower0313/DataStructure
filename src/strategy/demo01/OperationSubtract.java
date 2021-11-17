package strategy.demo01;

/**
 * @ClassName BinaryTree-OperationSubtract
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月11日22:20 - 周六
 * @Theme
 */
public class OperationSubtract implements Strategy {
    @Override
    public int deOpreation(int num1, int num2) {
        System.out.println("执行减法：");
        return num1 - num2;
    }
}
