package builder.demo02.speciclass;

import builder.demo02.Burger;

/**
 * @ClassName BinaryTree-ChickenBurger
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日8:45 - 周一
 * @Describe
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "芝士汉堡";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
