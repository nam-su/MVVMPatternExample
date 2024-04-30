package com.example.designpattern_mvvm_example

import kotlin.random.Random

class Model {

    lateinit var name: String

    // 0 ~ 5 까지의 랜덤한 숫자에 지정된 이름을 뽑는 로직
    fun randomName(): String {

        when(Random.nextInt(6)){

            0 -> name = "Human"
            1 -> name = "Harry"
            2 -> name = "Stella"
            3 -> name = "Hyun"
            4 -> name = "Lion"
            5 -> name = "Jin"

        }

        return name

    }

}