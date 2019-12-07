package kktyu.xyz.groupiepractice.rawRecyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import kktyu.xyz.groupiepractice.BR
import kktyu.xyz.groupiepractice.R

class ViewAdapter(private val list: List<String>) : RecyclerView.Adapter<ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val viewModel = ItemViewModel()
        val binding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item, parent, false
        )
        binding.setVariable(BR.viewModel, viewModel)

        return ItemViewHolder(binding.root, viewModel)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.itemViewModel.item = list[position]
    }

}