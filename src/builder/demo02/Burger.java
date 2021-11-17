package builder.demo02;

import builder.demo02.speciclass.Wrapper;

/**
 * @ClassName BinaryTree-Burger
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日8:42 - 周一
 * @Describe
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
