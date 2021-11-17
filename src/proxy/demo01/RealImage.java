package proxy.demo01;

/**
 * @ClassName BinaryTree-RealImage
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月14日20:14 - 周二
 * @Describe
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String name) {
        this.fileName = name;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("这是" + fileName + "照片");
    }

    private void loadFromDisk(String fileName) {
        System.out.println("正在加载" + fileName + "...");
    }
}
