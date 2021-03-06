package com.seggsmen.finalapp.logic

import android.content.res.Resources
import com.seggsmen.finalapp.R

fun sampleFoodsList(resources: Resources): List<SavedMeal> {
    return listOf(
//        SavedMeal(
//            name = "Chicken Fried Rice",
//            image = R.drawable.fried_rice,
//            vegetableServings = 3,
//            fruitServings = 0,
//            grainServings = 4,
//            fishServings = 0,
//            poultryServings = 3,
//            redMeatServings = 0,
//            oilServings = 1,
//            dairyServings = 0,
//            timesEaten = 15,
//        ),
//        SavedMeal(
//            name = "Gyu-don",
//            image = R.drawable.sample_food_gyudon,
//            vegetableServings = 1,
//            fruitServings = 1,
//            grainServings = 1,
//            fishServings = 1,
//            poultryServings = 1,
//            redMeatServings = 3,
//            oilServings = 1,
//            dairyServings = 1,
//            timesEaten = 1,
//        ),
//        SavedMeal(
//            name = "Katsu",
//            image = R.drawable.sample_food_katsu,
//            vegetableServings = 1,
//            fruitServings = 1,
//            grainServings = 1,
//            fishServings = 1,
//            poultryServings = 1,
//            redMeatServings = 3,
//            oilServings = 1,
//            dairyServings = 1,
//            timesEaten = 1,
//        ),
//        SavedMeal(
//            name = "Chicken waffles",
//            image = R.drawable.sample_food_chicken_waffles,
//            vegetableServings = 1,
//            fruitServings = 1,
//            grainServings = 1,
//            fishServings = 1,
//            poultryServings = 1,
//            redMeatServings = 3,
//            oilServings = 1,
//            dairyServings = 1,
//            timesEaten = 1,
//        ),
//        SavedMeal(
//            name = "Pepperoni Pizza",
//            image = R.drawable.sample_food_pepperoni_pizza,
//            vegetableServings = 1,
//            fruitServings = 1,
//            grainServings = 1,
//            fishServings = 1,
//            poultryServings = 1,
//            redMeatServings = 3,
//            oilServings = 1,
//            dairyServings = 1,
//            timesEaten = 1,
//        ),
//        SavedMeal(
//            name = "Bun bo hue",
//            image = R.drawable.sample_food_bun_bo_hue,
//            vegetableServings = 4,
//            fruitServings = 0,
//            grainServings = 3,
//            fishServings = 0,
//            poultryServings = 0,
//            redMeatServings = 4,
//            oilServings = 2,
//            dairyServings = 0,
//            timesEaten = 30,
//        ),
//        SavedMeal(
//            name = "Beef katsu sandwich",
//            image = R.drawable.sample_food_beef_katsu_sando,
//            vegetableServings = 1,
//            fruitServings = 1,
//            grainServings = 1,
//            fishServings = 1,
//            poultryServings = 1,
//            redMeatServings = 3,
//            oilServings = 1,
//            dairyServings = 1,
//            timesEaten = 1,
//        ),
//        SavedMeal(
//            name = "Rice krispy",
//            image = R.drawable.sample_food_rice_krispy,
//            vegetableServings = 1,
//            fruitServings = 1,
//            grainServings = 1,
//            fishServings = 1,
//            poultryServings = 1,
//            redMeatServings = 3,
//            oilServings = 1,
//            dairyServings = 1,
//            timesEaten = 1,
//        ),
//        SavedMeal(
//            name = "brisket chashu udon",
//            image = R.drawable.sample_food_brisket_chashu_udon,
//            vegetableServings = 1,
//            fruitServings = 1,
//            grainServings = 1,
//            fishServings = 1,
//            poultryServings = 1,
//            redMeatServings = 3,
//            oilServings = 1,
//            dairyServings = 1,
//            timesEaten = 1,
//        ),
//        SavedMeal(
//            name = "Dumplings",
//            image = R.drawable.sample_food_dumplings,
//            vegetableServings = 1,
//            fruitServings = 1,
//            grainServings = 1,
//            fishServings = 1,
//            poultryServings = 1,
//            redMeatServings = 3,
//            oilServings = 1,
//            dairyServings = 1,
//            timesEaten = 1,
//        ),
//        SavedMeal(
//            name = "Mango chicken curry",
//            image = R.drawable.sample_food_mango_chicken_curry,
//            vegetableServings = 1,
//            fruitServings = 1,
//            grainServings = 1,
//            fishServings = 1,
//            poultryServings = 1,
//            redMeatServings = 3,
//            oilServings = 1,
//            dairyServings = 1,
//            timesEaten = 1,
//        ),
//        SavedMeal(
//            name = "Salmon Wellington",
//            image = R.drawable.sample_food_salmon_wellington,
//            vegetableServings = 1,
//            fruitServings = 1,
//            grainServings = 1,
//            fishServings = 1,
//            poultryServings = 1,
//            redMeatServings = 3,
//            oilServings = 1,
//            dairyServings = 1,
//            timesEaten = 1,
//        ),
//        SavedMeal(
//            name = "Karbonader with mashed potato",
//            image = R.drawable.sample_food_karbonader_with_mash,
//            vegetableServings = 1,
//            fruitServings = 1,
//            grainServings = 1,
//            fishServings = 1,
//            poultryServings = 1,
//            redMeatServings = 3,
//            oilServings = 1,
//            dairyServings = 1,
//            timesEaten = 1,
//        ),
//        SavedMeal(
//            name = "Squid Ink Pasta",
//            image = R.drawable.sample_food_squid_ink_pasta,
//            vegetableServings = 1,
//            fruitServings = 1,
//            grainServings = 1,
//            fishServings = 1,
//            poultryServings = 1,
//            redMeatServings = 3,
//            oilServings = 1,
//            dairyServings = 1,
//            timesEaten = 1,
//        ),
//        SavedMeal(
//            name = "Borscht with mashed potato",
//            image = R.drawable.sample_food_borscht_with_mash,
//            vegetableServings = 1,
//            fruitServings = 1,
//            grainServings = 1,
//            fishServings = 1,
//            poultryServings = 1,
//            redMeatServings = 3,
//            oilServings = 1,
//            dairyServings = 1,
//            timesEaten = 1,
//        ),
    )
}