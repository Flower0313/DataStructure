package prototype.demo02;

/**
 * @ClassName BinaryTree-Circle
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月12日20:42 - 周日
 * @Describe
 */
public class Circle extends Shape{
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("圆形");
    }
}
