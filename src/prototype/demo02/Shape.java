package prototype.demo02;

/**
 * @ClassName BinaryTree-Shape
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月12日20:25 - 周日
 * @Describe
 * 一个类实现了Cloneable接口，以向Object.clone()方法指示该方法制作该类实例的字段对字段副本是合法的。
 * 在未实现Cloneable接口的实例上调用 Object 的 clone 方法会导致抛出异常CloneNotSupportedException 。
 */
public abstract class Shape implements Cloneable{
    private String id;
    //子类中可以直接调用type（一般用于子类构造函数中），而id是私有的，子类不能直接调用
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Object clone(){
        //深拷贝
        //先创建一份对象，等于是new了个新的地址，后面再克隆的时候就不会指向同一个地址，而是两个对象
        Object clone = null;
        try {
            //父类Object会调用native clone()方法来克隆对象
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
