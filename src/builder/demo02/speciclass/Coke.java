package builder.demo02.speciclass;

import builder.demo02.ColdDrink;

/**
 * @ClassName BinaryTree-Coke
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日8:46 - 周一
 * @Describe
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 10f;
    }
}
