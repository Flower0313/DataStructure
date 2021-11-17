package decorator.demo01;

/**
 * @ClassName BinaryTree-Skill_R
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日23:35 - 周一
 * @Describe
 */
public class Skill_R extends Skills{
    private String skillName;

    public Skill_R(Hero hero,String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能R："+skillName);
        super.learnSkills();
    }
}
