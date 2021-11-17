package builder.demo02;

/**
 * @ClassName BinaryTree-BuilderPatternDemo
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日8:48 - 周一
 * @Describe
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("素食套餐");
        vegMeal.showItems();
        System.out.println("总价: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\n肉食套餐");
        nonVegMeal.showItems();
        System.out.println("总价: " +nonVegMeal.getCost());
    }

}
