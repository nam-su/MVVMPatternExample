package com.example.designpattern_mvvm_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.designpattern_mvvm_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 데이터바인딩 사용
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        // 뷰모델 초기화
        viewModel = ViewModel()

        // lifecycleOwner 지정
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

    }

}