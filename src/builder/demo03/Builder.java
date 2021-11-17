package builder.demo03;

/**
 * @ClassName BinaryTree-Builder
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日21:53 - 周一
 * @Describe 抽象建造类，确定产品由两个部件PartA和PartB组成，并声明一个得到产品建造后结果的方法GetResult
 */
public abstract class Builder {
    public abstract void BuildPartA();
    public abstract void BuildPartB();
    public abstract Product GetResult();//返回产品
}
