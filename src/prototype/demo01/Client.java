package prototype.demo01;


/**
 * @ClassName BinaryTree-Client
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月07日0:25 - 周二
 * @Theme
 *
 * 需求：现有一只羊tom，年龄为1，颜色为白色，请克隆10只完全一样的羊
 *
 * 思路：Java中Object有一个clone()类，该方法可以将java对象复制一份，但是需要实现java类必须要实现的Cloneable接口，
 * 表示该类能够复制 => 原型模式
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //原型模式的clone()方法，Sheep重写此方法
        Sheep sheep = new Sheep("tom",1,"white");
        Sheep sheep2 = (Sheep) sheep.clone();


    }




}
