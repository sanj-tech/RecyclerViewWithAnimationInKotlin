package com.example.rvlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DefaultItemAnimator
import com.example.rvlearning.adapters.FurnitureAdapter
import com.example.rvlearning.databinding.ActivityMainBinding
import com.example.rvlearning.model.FurnitureModel

class MainActivity : AppCompatActivity() {
    lateinit var furnitureAdapter: FurnitureAdapter
    var list= mutableListOf<FurnitureModel>()

    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        activityMainBinding.rvFruit.itemAnimator = DefaultItemAnimator()
        list.add(FurnitureModel("chair", R.drawable.ic_launcher_background))
        list.add(FurnitureModel("chair", R.drawable.ic_launcher_background))
        list.add(FurnitureModel("chair", R.drawable.ic_launcher_background))
        list.add(FurnitureModel("chair", R.drawable.ic_launcher_background))
        list.add(FurnitureModel("chair", R.drawable.ic_launcher_background))
        list.add(FurnitureModel("chair", R.drawable.ic_launcher_background))
        list.add(FurnitureModel("chair", R.drawable.ic_launcher_background))
        list.add(FurnitureModel("chair", R.drawable.ic_launcher_background))
        list.add(FurnitureModel("chair", R.drawable.ic_launcher_background))
        list.add(FurnitureModel("chair", R.drawable.ic_launcher_background))
        list.add(FurnitureModel("chair", R.drawable.ic_launcher_background))
        list.add(FurnitureModel("chair", R.drawable.ic_launcher_background))
        list.add(FurnitureModel("chair", R.drawable.ic_launcher_background))
        list.add(FurnitureModel("chair", R.drawable.ic_launcher_background))
        list.add(FurnitureModel("chair", R.drawable.ic_launcher_background))
        list.add(FurnitureModel("chair", R.drawable.ic_launcher_background))
        list.add(FurnitureModel("chair", R.drawable.ic_launcher_background))
        list.add(FurnitureModel("chair", R.drawable.ic_launcher_background))
        furnitureAdapter = FurnitureAdapter(this, list)
        activityMainBinding.rvFruit.adapter = furnitureAdapter

    }
}