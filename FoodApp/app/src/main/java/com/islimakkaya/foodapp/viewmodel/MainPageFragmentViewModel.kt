package com.islimakkaya.foodapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.islimakkaya.foodapp.entity.Foods
import com.islimakkaya.foodapp.repository.FoodsDaoRepo

class MainPageFragmentViewModel : ViewModel() {
    private val frepo = FoodsDaoRepo()
    val foodsList : MutableLiveData<List<Foods>>

    init {
        loadFoods()
        foodsList = frepo.bringFoods()
    }

    fun loadFoods(){
        frepo.getAllFoods()
    }

    fun search(searchWord:String) {
        frepo.searchFood(searchWord)
    }
}