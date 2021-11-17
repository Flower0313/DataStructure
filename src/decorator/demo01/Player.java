package decorator.demo01;

/**
 * @ClassName BinaryTree-Player
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日23:38 - 周一
 * @Describe
 */
public class Player {
    public static void main(String[] args) {
        Hero hero = new BlindMonk("李青");

        Skills skills = new Skills(hero);
        Skills q = new Skill_Q(skills,"天银波");
        Skills r = new Skill_R(q,"猛龙摆尾");

        //学习技能
        r.learnSkills();
    }
}
