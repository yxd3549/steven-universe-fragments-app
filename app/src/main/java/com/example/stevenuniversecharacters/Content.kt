package com.example.stevenuniversecharacters


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_content.*

/**
 * A simple [Fragment] subclass.
 */
class Content : Fragment() {

    companion object {
        const val ARG_IMAGE_ID = "image_id"
        const val ARG_TEXT_ID = "text_id"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_content, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        characterImage.setImageResource(arguments!!.getInt(ARG_IMAGE_ID))
        characterName.text = arguments!!.getString(ARG_TEXT_ID)
    }


}
