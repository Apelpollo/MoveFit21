package com.example.movefit21

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_f, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clickListener()
    }

    private fun clickListener() {
        val imagesquat = requireView().findViewById<ImageView>(R.id.senta)
        val imagesitups = requireView().findViewById<ImageView>(R.id.ads)
        val imagecurp = requireView().findViewById<ImageView>(R.id.pesa)
        val imagepushups = requireView().findViewById<ImageView>(R.id.laga)
        val imageside = requireView().findViewById<ImageView>(R.id.lata)

        imagesquat.setOnClickListener {
            openSquatActivity()
        }
        imagesitups.setOnClickListener {
            openSitupsActivity()
        }
        imagecurp.setOnClickListener {
            openSitupsActivity()
        }
        imagepushups.setOnClickListener {
            openSitupsActivity()
        }
        imageside.setOnClickListener {
            openSitupsActivity()
        }
    }

    private fun openSitupsActivity() {
        val intent = Intent(requireContext(), SetupsActivity::class.java)
        startActivity(intent)
    }

    private fun openSquatActivity() {
        val intent = Intent(requireContext(), SquatActivity2::class.java)
        startActivity(intent)
    }
    private fun openCurpActivity() {
        val intent = Intent(requireContext(), CurpActivity::class.java)
        startActivity(intent)
    }
    private fun openPushupsActivity() {
        val intent = Intent(requireContext(), PushupsActivity::class.java)
        startActivity(intent)
    }
    private fun openSideActivity() {
        val intent = Intent(requireContext(), SideActivity::class.java)
        startActivity(intent)
    }

    companion object {
        private const val ARG_PARAM1 = "param1"
        private const val ARG_PARAM2 = "param2"

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}