package prototype.demo02;

/**
 * @ClassName BinaryTree-Square
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月12日20:39 - 周日
 * @Describe
 */
public class Square extends Shape{
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("长方形");
    }
}
