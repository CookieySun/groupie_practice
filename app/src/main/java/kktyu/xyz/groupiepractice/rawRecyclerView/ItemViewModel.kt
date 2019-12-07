package kktyu.xyz.groupiepractice.rawRecyclerView

import androidx.databinding.BaseObservable

class ItemViewModel : BaseObservable() {
    var item: String = ""
        set(value) {
            field = value
            notifyChange()
        }
}