package prototype.deepclone;

import java.awt.*;
import java.io.*;

/**
 * @ClassName BinaryTree-DeepProType
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月12日22:11 - 周日
 * @Describe
 */
public class DeepProType implements Serializable,Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;//引用类型

    public DeepProType() {
        super();
    }

    //深拷贝 - 方式1：重写clone方法
    //Q:clone()后的对象和原来对象的地址是不一样的，那为什么还需要深拷贝呢？
    //A:因为一个对象如果含有引用类型的成员变量，虽然这个对象和克隆对象的地址是不一样的
    //但是他们其中的引用类型成员变量的地址还是一样的啊，通俗一点说是整体不同，细节相同
    //所以需要对他的引用类型成员变量进行单独的克隆使之引用类型成员变量的地址也不同才能实现真正意义上的深拷贝。
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里完成对基本数据类型和String的克隆
        deep = super.clone();
        //对引用类型的属性进行单独处理,因为不这样处理的话，克隆的对象地址是一样的
        DeepProType deepProType = (DeepProType) deep;
        //将对象中的引用类型成员进行单独的复制
        deepProType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProType;
    }


    //深拷贝 - 方式2：序列化
    public Object deepClone() throws IOException, ClassNotFoundException {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        //序列化
        bos = new ByteArrayOutputStream();
        //ObjectOutputStream构造方法需要一个地方来存序列化后的对象，此时用了bos
        oos = new ObjectOutputStream(bos);//将序列化后的对象存到了bos中，如果没有bos一般是存在文件上
        oos.writeObject(this);//当前对象以对象流方式输出

        //反序列化
        bis = new ByteArrayInputStream(bos.toByteArray());//从bos中来读取对象
        ois = new ObjectInputStream(bis);
        DeepProType copyObj = (DeepProType) ois.readObject();

        ois.close();
        bis.close();
        oos.close();
        bos.close();
        return copyObj;
    }

}
