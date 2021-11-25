package com.example.personalnote.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.personalnote.R
import com.example.personalnote.databinding.ActivityNoteBinding

class NoteActivity : AppCompatActivity() {
    lateinit var binding: ActivityNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_note)
    }
}