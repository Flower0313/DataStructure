package builder.demo03;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BinaryTree-Product
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日21:52 - 周一
 * @Describe 产品类，由多个部件组成
 */
public class Product {
    List<String> parts = new ArrayList<>();

    public void Add(String part){
        parts.add(part);
    }

    public void Show(){
        System.out.println("产品 创建----");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
