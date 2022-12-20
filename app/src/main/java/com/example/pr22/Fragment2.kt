package com.example.pr22antuh

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.pr22.R

class Fragment2 : Fragment() {
    private lateinit var infoTextView: TextView
    private lateinit var pasImageView: ImageView
    private lateinit var pasDescriptions: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment2, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        infoTextView = view.findViewById(R.id.textView)
        pasImageView = view.findViewById(R.id.imageView)
        pasDescriptions = resources.getStringArray(R.array.fruits)
    }
    fun setDescription(buttonIndex: Int) {
        val description: String = pasDescriptions[buttonIndex]
        infoTextView.text = description
        when (buttonIndex) {
            1 -> pasImageView.setImageResource(R.drawable.apple)
            2 -> pasImageView.setImageResource(R.drawable.sliva)
            3 -> pasImageView.setImageResource(R.drawable.abrikoss)
        }
    }

}