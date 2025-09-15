package com.example.lab_week_03

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.TextView

class DetailFragment : Fragment(R.layout.fragment_detail) {

    private val coffeeTitle: TextView?
        get() = view?.findViewById(R.id.coffee_title)
    private val coffeeDesc: TextView?
        get() = view?.findViewById(R.id.coffee_desc)
    private val backButton: Button?
        get() = view?.findViewById(R.id.coffee_button)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val coffeeId = arguments?.getInt(ListFragment.COFFEE_ID) ?: 0
        setCoffeeData(coffeeId)

        backButton?.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }

    private fun setCoffeeData(id: Int) {
        when (id) {
            R.id.affogato -> {
                coffeeTitle?.text = getString(R.string.affogato_title)
                coffeeDesc?.text = getString(R.string.affogato_desc)
            }
            R.id.americano -> {
                coffeeTitle?.text = getString(R.string.americano_title)
                coffeeDesc?.text = getString(R.string.americano_desc)
            }
            R.id.latte -> {
                coffeeTitle?.text = getString(R.string.latte_title)
                coffeeDesc?.text = getString(R.string.latte_desc)
            }
            R.id.cappucino -> {
                coffeeTitle?.text = getString(R.string.cappuccino_title)
                coffeeDesc?.text = getString(R.string.cappuccino_desc)
            }
            R.id.espresso -> {
                coffeeTitle?.text = getString(R.string.espresso_title)
                coffeeDesc?.text = getString(R.string.espresso_desc)
            }
            else -> {
                coffeeTitle?.text = "Unknown Coffee"
                coffeeDesc?.text = "Description not found."
            }
        }
    }
}