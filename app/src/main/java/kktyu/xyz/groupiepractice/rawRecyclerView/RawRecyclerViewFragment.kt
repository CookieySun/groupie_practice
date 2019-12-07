package kktyu.xyz.groupiepractice.rawRecyclerView

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kktyu.xyz.groupiepractice.ViewList
import kktyu.xyz.groupiepractice.databinding.FragmentRecyclerViewBinding

class RawRecyclerViewFragment : Fragment() {
    lateinit var binding: FragmentRecyclerViewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRecyclerViewBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewModel = ViewModel(
            ViewAdapter(
                ViewList().list
            )
        )
    }
}
