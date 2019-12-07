package kktyu.xyz.groupiepractice.groupie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.xwray.groupie.Group
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import kktyu.xyz.groupiepractice.ViewList
import kktyu.xyz.groupiepractice.databinding.FragmentRecyclerViewBinding

class GroupieFragment : Fragment() {
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

        val adapter = GroupAdapter<GroupieViewHolder>()

        binding.recyclerView.adapter = adapter

        adapter.update(mutableListOf<Group>().apply {
            ViewList().list.forEach {
                add(GroupieItem(it))
            }
        })
    }
}
