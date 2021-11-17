package builder.demo01;

/**
 * @ClassName BinaryTree-HighBuilder
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月08日0:25 - 周三
 * @Theme
 */
//具体建造者
public class HighHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基100米");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼打地基50cm");
    }

    @Override
    public void buildRoof() {
        System.out.println("高楼牛逼");
    }
}
