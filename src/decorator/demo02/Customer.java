package decorator.demo02;/**
* @ClassName BinaryTree-Cusomer
* @Author Holden_—__——___———____————_____Xiao
* @Create 2021年9月14日9:44 - 周二
* @Describe 客户
*/public class Customer {
    public static void main(String[] args) {
        //层层包围，调用的cost()的时候方法也是递归调用的。
        Beverage myTea = new MilkTea();
        myTea = new Boba(myTea);//加bobo进去
        myTea = new Pudding(myTea);
        double totalCost = myTea.cost();
        System.out.println(totalCost);
    }
}


