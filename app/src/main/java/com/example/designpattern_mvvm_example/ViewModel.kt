package com.example.designpattern_mvvm_example

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel {

    // 모델 초기화
    private val model = Model()
    private val _name: MutableLiveData<String> = MutableLiveData()

    // TextView 의 초기값 세팅
    init {

        _name.value = "오늘의 당첨자는?"

    }

    // _name 의 값을 return 해주는 메서드
    fun resultName(): LiveData<String> {

        return _name

    }

    // 모델의 메서드 호출 해서 _name.value 초기화
    fun setName() {

        _name.value = model.randomName()

    }

}