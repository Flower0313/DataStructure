package builder.demo01;

/**
 * @ClassName BinaryTree-CommonHouse
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月08日0:23 - 周三
 * @Theme
 */
//普通建造者
public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void buildRoof() {
        System.out.println("普通房子盖普通屋顶");
    }
}
