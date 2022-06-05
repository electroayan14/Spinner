package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.spinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener{
    lateinit var binding: ActivityMainBinding
    var listofData = arrayOf("Kolkata","Malda","Delhi","Mumbai","Rajasthan")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
                val view = binding.root
        setContentView(view)
        binding.spnSelect.onItemSelectedListener = this
        val aradapt = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,listofData)
        aradapt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spnSelect.adapter = aradapt
    }


    override fun onItemSelected(arg0: AdapterView<*>?, arg1: View?, position: Int, id: Long) {
        binding.txtItem.text ="Your City: "+ listofData[position]
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("No0t00000 yet implemented")
    }
}