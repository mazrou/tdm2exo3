package com.e.noteapplication.adapter
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.e.noteapplication.data.Note
import com.e.noteapplication.databinding.NoteItemBinding

class NoteAdapter (
    private val notes: MutableList<Note>
): RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {

        val inflater = LayoutInflater.from(parent.context)

        val binding = NoteItemBinding.inflate(inflater)
        return NoteViewHolder(binding)

    }

    override fun getItemCount() = notes.size

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.noteRecyclerView!!.note = notes[position]
    }

    inner class NoteViewHolder(
        val noteRecyclerView : NoteItemBinding?
    ) : RecyclerView.ViewHolder(noteRecyclerView!!.root) , View.OnClickListener{


        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View? ) {
           
        }

    }
}