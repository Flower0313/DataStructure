package strategy.demo01;

/**
 * @ClassName BinaryTree-Context
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月11日22:21 - 周六
 * @Theme Context是上下文对象，它用excuteStrategy来维护不同的对象引用
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //这个deOpreation方法肯定是Strategy的，并且Strategy应该有子类来继承重写这个方法
    public int executeStrategy(int num1, int num2) {
        return strategy.deOpreation(num1, num2);
    }
}
