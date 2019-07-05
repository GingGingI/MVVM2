package c.gingdev.mvvm_2.vm

import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class BasicViewModel: ViewModel() {
    val buttonTxt = ObservableField<String>()

    fun setText(Text: String) {
        buttonTxt.set(Text)
    }

    fun buttonClick() {
        setText("Hello function")
    }

    val clickListener = View.OnClickListener {
        setText("Hello Listener")
    }
}