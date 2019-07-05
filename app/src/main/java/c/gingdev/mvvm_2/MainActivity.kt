package c.gingdev.mvvm_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import c.gingdev.mvvm_2.databinding.ActivityMainBinding
import c.gingdev.mvvm_2.vm.BasicViewModel

class MainActivity : AppCompatActivity() {

    private val model = BasicViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        binding.model = model

        model.setText("hello")
    }
}
