package builder.demo04.new1;

/**
 * @ClassName BinaryTree-Computer
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年10月10日16:23 - 周日
 * @Describe 当一个类的构造函数参数超过4个，而且这些参数有些是可选的时，我们通常有两种办法来构建它的对象。你用多个构造器
 * 可读性太差，
 */
public class Computer {
    private final String cpu;//必须
    private final String ram;//必须
    private final int usbCount;//可选
    private final String keyboard;//可选
    private final String display;//可选

    private Computer(Builer builder) {
        //如果没set的会采用默认值
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.keyboard = builder.keyboard;
        this.display = builder.display;
    }


    public static class Builer {
        private String cpu;//必须
        private String ram;//必须
        private int usbCount;//可选
        private String keyboard;//可选
        private String display;//可选


        public Builer(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builer setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            //return this是因为返回的Builder又可以调用其他方法
            return this;
        }

        public Builer setKeyBoard(String keyBoard) {
            this.keyboard = keyBoard;
            return this;
        }

        public Builer setDisplay(String display) {
            this.display = display;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usbCount=" + usbCount +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }

}
