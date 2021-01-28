package com.example.jobly

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_election_reg.view.*
import kotlinx.android.synthetic.main.fragment_mail.view.*


class FragmentElectionReg : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_election_reg, container, false)

        //codigo para pasar de un fragment a otro
        view.btnMailReg.setOnClickListener{Navigation.findNavController(view).navigate(R.id.action_Inicio_to_mail)}
        view.back.setOnClickListener{Navigation.findNavController(view).navigate(R.id.action_mail_to_Inicio)}

        //codigo de registro desde facebook
        view.btnFacebookReg.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_Inicio_to_mail)

        }


        return view



    }


}