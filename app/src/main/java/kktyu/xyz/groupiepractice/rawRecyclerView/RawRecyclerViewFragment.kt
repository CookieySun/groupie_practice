package kktyu.xyz.groupiepractice.rawRecyclerView

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kktyu.xyz.groupiepractice.R
import kktyu.xyz.groupiepractice.ViewList
import kotlinx.android.synthetic.main.fragment_recycler_view.*

class RawRecyclerViewFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_recycler_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycler_view.adapter =
            ViewAdapter(
                ViewList().list
            )
    }
}
