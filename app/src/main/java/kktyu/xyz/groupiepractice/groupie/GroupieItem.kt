package kktyu.xyz.groupiepractice.groupie

import com.xwray.groupie.databinding.BindableItem
import kktyu.xyz.groupiepractice.ItemViewModel
import kktyu.xyz.groupiepractice.R
import kktyu.xyz.groupiepractice.databinding.RecyclerItemBinding

class GroupieItem(private val item: String) : BindableItem<RecyclerItemBinding>() {
    override fun getLayout() = R.layout.recycler_item

    override fun bind(viewBinding: RecyclerItemBinding, position: Int) {
        viewBinding.viewModel = ItemViewModel()
        viewBinding.viewModel?.item = item
    }
}