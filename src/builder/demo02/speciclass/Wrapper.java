package builder.demo02.speciclass;

import builder.demo02.Packing;

/**
 * @ClassName BinaryTree-Wrapper
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日8:42 - 周一
 * @Describe
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "打包袋";
    }
}
