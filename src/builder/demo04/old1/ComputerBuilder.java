package builder.demo04.old1;

/**
 * @ClassName BinaryTree-ComputerBuilder
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年10月10日17:26 - 周日
 * @Describe 抽象建造者
 */
public abstract class ComputerBuilder {
    //这里都是可选参数
    public abstract void setUsbCount();
    public abstract void setKeyboard();
    public abstract void setDisplay();

    //返回Computer
    public abstract Computer getComputer();
}
