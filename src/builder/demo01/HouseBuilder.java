package builder.demo01;

/**
 * @ClassName BinaryTree-HouseBuilder
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月08日0:13 - 周三
 * @Theme
 */


//抽象的建造者
public abstract class HouseBuilder {
    protected House house = new House();

    //将建造的流程写好,抽象方法，子类实现
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildRoof();

    //建造房子,将产品(房子)返回
    public House buildHouse(){
        return house;
    }
}
