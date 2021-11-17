package builder.demo03;

/**
 * @ClassName BinaryTree-Director
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日21:58 - 周一
 * @Describe
 */
public class Director {
    public void Construct(Builder builder){
        builder.BuildPartA();
        builder.BuildPartB();
    }
}
