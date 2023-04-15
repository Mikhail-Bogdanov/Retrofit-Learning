package com.example.retrfitlearning.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrfitlearning.data.repository.Repository
import com.example.retrfitlearning.model.beznal.Beznalichka
import com.example.retrfitlearning.model.nal.Nalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel: ViewModel() {

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Beznalichka>> = MutableLiveData()

    fun getBeznalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repo.getBeznalichka()
        }
    }

}