package builder.demo02;

/**
 * @ClassName BinaryTree-Item
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日8:39 - 周一
 * @Describe 物品类
 */
public interface Item {
    public String name();//菜名
    public Packing packing();//打包方式
    public float price();//价格
}
