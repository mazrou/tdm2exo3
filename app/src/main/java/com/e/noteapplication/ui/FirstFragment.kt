package com.e.noteapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.e.noteapplication.R
import com.e.noteapplication.adapter.NoteAdapter
import com.e.noteapplication.data.Note
import com.e.noteapplication.repository.NoteRepository
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {
    private lateinit var repository :NoteRepository
    private lateinit var list : MutableList<Note>
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        repository  = NoteRepository(requireContext())
         list = repository.getAllNote()

         recyclerView.also {
             it.layoutManager= LinearLayoutManager(requireContext())
             it.setHasFixedSize(true)
             it.adapter = NoteAdapter(list)
         }

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }
}
