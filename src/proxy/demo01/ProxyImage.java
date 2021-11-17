package proxy.demo01;

/**
 * @ClassName BinaryTree-ProxyImage
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月14日20:20 - 周二
 * @Describe
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
