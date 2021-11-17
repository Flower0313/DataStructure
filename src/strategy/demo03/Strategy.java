package strategy.demo03;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName BinaryTree-Strategy
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月11日23:21 - 周六
 * @Theme 策略模式在Java中的应用
 */
public class Strategy {
    public static void main(String[] args) {
        //自定义数组
        Integer[] nums = {8, 1, 2, 9, 11, 5, 4};

        //实现了Comparator接口，匿名类对象
        //其实这个匿名类对象其实就实现了Comparator接口，相当于demo02中的Client中用FlyBehavior实现匿名类
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };
        //方式1
        Arrays.sort(nums, comparator);
        System.out.println(Arrays.toString(nums));

        //方式2 - 同时lambda表达式实现
        Arrays.sort(nums, (var1, var2) -> {
            if (var1.compareTo(var2) > 0) {
                return 1;
            } else {
                return -1;
            }
        });
        System.out.println(Arrays.toString(nums));


    }
}
