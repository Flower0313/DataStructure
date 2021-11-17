package builder.demo03;

/**
 * @ClassName BinaryTree-ConcreteBuilder1
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日21:55 - 周一
 * @Describe 具体建造者类
 */
public class Xbox extends Builder{
    private Product product = new Product();

    @Override
    public void BuildPartA() {
        product.Add("微软");
    }

    @Override
    public void BuildPartB() {
        product.Add("游戏礼包");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
