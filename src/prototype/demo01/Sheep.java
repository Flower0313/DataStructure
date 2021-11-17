package prototype.demo01;

/**
 * @ClassName BinaryTree-Sheep
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月07日0:24 - 周二
 * @Theme
 */
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep[" +
                "名字='" + name + '\'' +
                ", 年龄=" + age +
                ", 颜色='" + color + '\'' +
                ']';
    }

    /**
     * 克隆该实例，使用默认的clone()方法
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        //clone()调取了native方法
        sheep = (Sheep) super.clone();
        return sheep;
    }
}
