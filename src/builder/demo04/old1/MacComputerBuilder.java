package builder.demo04.old1;

/**
 * @ClassName BinaryTree-MacComputerBuilder
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年10月10日17:27 - 周日
 * @Describe
 */
public class MacComputerBuilder extends ComputerBuilder {
    private Computer computer;

    public MacComputerBuilder(String cpu, String ram) {
        computer = new Computer(cpu, ram);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(2);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("苹果键盘");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("苹果显示器");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
