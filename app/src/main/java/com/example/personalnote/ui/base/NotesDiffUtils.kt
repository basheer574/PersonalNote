package com.example.personalnote.ui.base

import androidx.recyclerview.widget.DiffUtil

class NotesDiffUtils<T>(
    private val notesList: List<T>,
    private val notesNewList: List<T>
) :
    DiffUtil.Callback() {
    override fun getOldListSize() = notesList.size

    override fun getNewListSize() = notesNewList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
        notesList[oldItemPosition] == notesNewList[newItemPosition]

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) = true
}