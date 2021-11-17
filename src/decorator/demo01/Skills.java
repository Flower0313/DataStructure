package decorator.demo01;

/**
 * @ClassName BinaryTree-Skills
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日23:30 - 周一
 * @Describe
 */
//Decorator 技能栏
public class Skills implements Hero{
    //持有一个英雄对象接口
    private Hero hero;

    public Skills(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learnSkills() {
        if(hero != null){
            hero.learnSkills();
        }

    }
}
