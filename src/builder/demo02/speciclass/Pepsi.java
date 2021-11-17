package builder.demo02.speciclass;

import builder.demo02.ColdDrink;

/**
 * @ClassName BinaryTree-Pepsi
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日8:47 - 周一
 * @Describe
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 9f;
    }
}
