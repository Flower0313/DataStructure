package builder.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BinaryTree-Meal
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日8:48 - 周一
 * @Describe 套餐
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("物品 : " + item.name());
            System.out.print(", 打包方式 : " + item.packing().pack());
            System.out.println(", 价格 : " + item.price());
        }
    }
}
