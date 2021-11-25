package com.example.personalnote.ui.home

import com.example.personalnote.data.Note
import com.example.personalnote.ui.base.BaseAdapter

interface NoteInteractionListener : BaseAdapter.BaseInteractionListener {
    fun onNoteSelected(note: Note)
}