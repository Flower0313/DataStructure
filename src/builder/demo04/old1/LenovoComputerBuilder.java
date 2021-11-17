package builder.demo04.old1;

/**
 * @ClassName BinaryTree-LenovoComputerBuilder
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年10月10日17:30 - 周日
 * @Describe
 */
public class LenovoComputerBuilder extends ComputerBuilder {
    private Computer computer;

    public LenovoComputerBuilder(String cpu, String ram) {
        computer = new Computer(cpu, ram);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(3);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("联想键盘");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("联想显示器");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
