package mohammad.mohammadi.opeqesample.ui.home

import android.content.res.AssetManager
import ir.apbrishammap.abrishammapdevsample.ui.BaseView
import mohammad.mohammadi.opeqesample.model.FoodModel
import mohammad.mohammadi.opeqesample.ui.BasePresenter

interface HomeContract {
    interface View : BaseView<Presenter> {
        fun updateRestaurantView(foods: ArrayList<FoodModel>)
        fun updateFoodView(foods: ArrayList<FoodModel>)
    }

    interface Presenter : BasePresenter<View> {
        fun loadRestaurant(assetManager: AssetManager)
        fun loadFood(assetManager: AssetManager)
    }
}