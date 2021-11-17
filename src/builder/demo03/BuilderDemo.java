package builder.demo03;

/**
 * @ClassName BinaryTree-BuilderDemo
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日21:59 - 周一
 * @Describe 客户代码，客户不需知道具体的建造过程
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new PS5();
        director.Construct(b1);

        Product p1 = b1.GetResult();
        p1.Add("新配件");
        p1.Show();
    }
}
