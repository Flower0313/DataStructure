package prototype.deepclone;

import java.io.IOException;

/**
 * @ClassName BinaryTree-Client
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月12日22:48 - 周日
 * @Describe
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        DeepProType p = new DeepProType();
        p.name = "肖华";
        p.deepCloneableTarget = new DeepCloneableTarget("flower", "holdenxiao类");

        //方式1
        DeepProType p2 = (DeepProType) p.clone();
        System.out.println(p.deepCloneableTarget == p2.deepCloneableTarget);


        //方式2
        DeepProType p3 = (DeepProType) p.deepClone();
        System.out.println(p.deepCloneableTarget == p3.deepCloneableTarget);
    }
}
