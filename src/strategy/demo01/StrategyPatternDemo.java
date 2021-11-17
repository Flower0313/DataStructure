package strategy.demo01;

/**
 * @ClassName BinaryTree-StrategyPatternDemo
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月11日22:22 - 周六
 * @Theme
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        //加法
		Strategy add = new OpreationAdd();
        Context context = new Context(add);
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        //减法
        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        //乘法
        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

    }
}
