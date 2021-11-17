package builder.demo04.old1;

/**
 * @ClassName BinaryTree-Client
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年10月10日17:37 - 周日
 * @Describe
 */
public class Client {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        //苹果笔记本
        ComputerBuilder builder = new MacComputerBuilder("M1", "金士顿64G");
        //这个代码会将自定义中的set可选的参数加载进去
        director.makeComputer(builder);
        Computer macComputer = builder.getComputer();
        System.out.println("mac computer:" + macComputer.toString());

        ComputerBuilder lenovoBuilder = new LenovoComputerBuilder("i9", "三星128G");
        director.makeComputer(lenovoBuilder);
        Computer lenovoComputer = lenovoBuilder.getComputer();
        System.out.println("lenovo computer:" + lenovoComputer.toString());


    }
}
