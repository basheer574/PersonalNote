package com.example.personalnote.ui.home

import com.example.personalnote.R
import com.example.personalnote.data.Note
import com.example.personalnote.ui.base.BaseAdapter

class NotesAdapter(items: List<Note>,listener: NoteInteractionListener
): BaseAdapter<Note>(items,listener) {
    override val layoutId: Int = R.layout.item_note
}