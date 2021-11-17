package prototype.demo02;

import java.util.Hashtable;

/**
 * @ClassName BinaryTree-ShapeCache
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月12日20:43 - 周日
 * @Describe
 */
public class ShapeCache {
    //用hashtable来存放类
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        //返回它的克隆对象
        return (Shape) cachedShape.clone();
    }

    public static void localCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }


}
