package prototype.demo02;

/**
 * @ClassName BinaryTree-PrototypePatternDeom
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月12日20:58 - 周日
 * @Describe 浅拷贝：只是复制对象的表明，地址还是一样，指向同一个堆。
 * 深拷贝：两个地址完全不同的对象，但属性一模一样。
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.localCache();

        Shape cloneShape = (Shape) ShapeCache.getShape("1");
        System.out.println("形状："+cloneShape.getType());



    }
}
