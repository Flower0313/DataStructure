package builder.demo03;

/**
 * @ClassName BinaryTree-PS5
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日21:57 - 周一
 * @Describe 具体建造类
 */
public class PS5 extends Builder{
    private Product product = new Product();
    @Override
    public void BuildPartA() {
        System.out.println("索尼");
    }

    @Override
    public void BuildPartB() {
        System.out.println("震动手柄");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
