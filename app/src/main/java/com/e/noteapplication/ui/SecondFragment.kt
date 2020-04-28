package com.e.noteapplication.ui

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.e.noteapplication.R
import com.e.noteapplication.data.Note
import com.e.noteapplication.repository.NoteRepository
import kotlinx.android.synthetic.main.fragment_second.*
import java.lang.Exception
import java.util.*
import android.widget.Toast.makeText
import com.google.android.material.snackbar.Snackbar

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {


    private lateinit var repository :NoteRepository


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            try {
                repository= NoteRepository(requireContext())
                repository.insert(Note(title_note.text.toString() , content_note.text.toString() , Date().toString(),Color().toString()))

            }catch (e : Exception){
                e.printStackTrace()
                println(e.message)
            }
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }
}
