package decorator.demo01;

/**
 * @ClassName BinaryTree-Skill_E
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日23:34 - 周一
 * @Describe
 */
public class Skill_E extends Skills{
    private String skillName;

    public Skill_E(Hero hero,String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能E："+skillName);
        super.learnSkills();
    }
}
