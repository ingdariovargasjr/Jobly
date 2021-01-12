package com.example.jobly

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_agenda.*


class AgendaFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {



        return inflater.inflate(R.layout.fragment_agenda, container, false)




    }

    companion object {
        @JvmStatic
        fun newInstance() =
            AgendaFragment().apply {
                arguments = Bundle().apply {}
            }


    }
}