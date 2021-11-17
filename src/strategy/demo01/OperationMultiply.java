package strategy.demo01;

/**
 * @ClassName BinaryTree-OperationMultiply
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月11日22:21 - 周六
 * @Theme
 */
public class OperationMultiply implements Strategy {
    @Override
    public int deOpreation(int num1, int num2) {
        System.out.println("这是乘法");
        return num1 * num2;
    }
}
