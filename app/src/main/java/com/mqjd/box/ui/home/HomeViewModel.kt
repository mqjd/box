package com.mqjd.box.ui.home

import android.view.View
import androidx.databinding.ObservableArrayList
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.mqjd.box.BR
import com.mqjd.box.R
import me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter
import me.tatarka.bindingcollectionadapter2.ItemBinding


class HomeViewModel : ViewModel() {

    val items = ObservableArrayList<String>().apply {
        for (i in 0 until 300) {
            add("item $i")
        }
    }

    val itemBinding = ItemBinding.of<String>(BR.item, R.layout.layout_item)

    val adapter = LoggingRecyclerViewAdapter<String>()

    val viewHolder =
        BindingRecyclerViewAdapter.ViewHolderFactory { binding -> MyAwesomeViewHolder(binding.root) }

    private class MyAwesomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}