package builder.demo02;

import builder.demo02.speciclass.Bottle;

/**
 * @ClassName BinaryTree-ColdDrink
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日8:44 - 周一
 * @Describe
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
