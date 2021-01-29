package com.example.jobly.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.jobly.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [mail.newInstance] factory method to
 * create an instance of this fragment.
 */
class mail : Fragment(), View.OnClickListener {
    // TODO: Rename and change types of parameters

    var nav : NavController ?=null
    var button: Button ?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mail, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav= Navigation.findNavController(view)
        view.findViewById<View>(R.id.continue_mail)?.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        nav?.navigate(R.id.action_mail_to_passwordFragment)
    }


}