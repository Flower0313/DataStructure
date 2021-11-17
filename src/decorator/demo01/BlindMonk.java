package decorator.demo01;

/**
 * @ClassName BinaryTree-BlindMonk
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日23:28 - 周一
 * @Describe
 */

//ConcreteComponent 具体英雄盲僧
public class BlindMonk implements Hero{
    private String name;

    public BlindMonk(String name) {
        this.name = name;
    }

    @Override
    public void learnSkills() {

    }
}
