package observer.demo02;

/**
 * @ClassName BinaryTree-Subject
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月15日22:43 - 周三
 * @Describe 抽象被观察者接口
 */
public interface Subject {
    public void registerObserver(Observer o);//用于添加观察者
    public void removeObserver(Observer o);//移除观察者
    public void notifyObserver();//通知观察者

}
