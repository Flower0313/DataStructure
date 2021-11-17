package decorator.demo01;

/**
 * @ClassName BinaryTree-Skill_Q
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日23:31 - 周一
 * @Describe
 */
public class Skill_Q extends Skills{
    private String skillName;

    public Skill_Q(Hero hero,String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能Q："+skillName);
        super.learnSkills();
    }
}
