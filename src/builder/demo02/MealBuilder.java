package builder.demo02;

import builder.demo02.speciclass.ChickenBurger;
import builder.demo02.speciclass.Coke;
import builder.demo02.speciclass.Pepsi;
import builder.demo02.speciclass.VegBurger;

/**
 * @ClassName BinaryTree-MealBuilder
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年9月13日8:48 - 周一
 * @Describe 抽象建造者
 */
public class MealBuilder {
    //素食套餐
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    //肉食套餐
    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
