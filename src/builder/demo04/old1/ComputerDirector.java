package builder.demo04.old1;

/**
 * @ClassName BinaryTree-ComputerDirector
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年10月10日17:34 - 周日
 * @Describe
 */
public class ComputerDirector {
    public void makeComputer(ComputerBuilder builder){
        //真正的执行步骤
        builder.setUsbCount();
        builder.setDisplay();
        builder.setKeyboard();
    }
}
