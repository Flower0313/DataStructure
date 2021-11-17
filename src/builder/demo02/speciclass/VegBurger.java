package builder.demo02.speciclass;

import builder.demo02.Burger;

/**
 * @ClassName BinaryTree-VegBurger
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日8:44 - 周一
 * @Describe
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
