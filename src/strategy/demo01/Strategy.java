package strategy.demo01;

/**
 * @ClassName BinaryTree-Strategy
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月11日22:19 - 周六
 * @Theme
 */
public interface Strategy {
    /**
     * 对两个数值的操作，点击下箭头可以看到子类重写了方法
     *
     * @param num1 数值1
     * @param num2 数值2
     * @return
     */
    public int deOpreation(int num1, int num2);
}
