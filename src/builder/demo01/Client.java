package builder.demo01;

/**
 * @ClassName BinaryTree-BuilderTest
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月08日0:30 - 周三
 * @Theme
 */
public class Client {
    public static void main(String[] args) {
        //1.以多态的方式创建两个需要盖的房子对象
        HouseBuilder commonHouse = new CommonHouse();
        HouseBuilder highHouse = new HighHouse();

        //2.通过指挥者简历普通房子，以构造器的方式传入
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House h1 = houseDirector.constructHouse();

        System.out.println("-------------------------------");

        //3.通过set方法修改指挥者的建造对象
        houseDirector.setHouseBuilder(highHouse);
        House h2 = houseDirector.constructHouse();
    }
}
