package builder.demo04.new1;


/**
 * @ClassName BinaryTree-Client
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年10月10日16:48 - 周日
 * @Describe
 */
public class Client {
    public static void main(String[] args) {
        /*
        * 简而言之，内部类Builder替代了Computer的构造方法的操作，使每次添加属性更为直观
        * */
        Computer computer = new Computer.Builer("因特尔", "金士顿").setKeyBoard("k8").build();
        System.out.println(computer);
    }
}
