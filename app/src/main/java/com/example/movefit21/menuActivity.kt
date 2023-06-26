package com.example.movefit21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.bottomnavigation.BottomNavigationView


class menu : AppCompatActivity() {

   lateinit var navegation:BottomNavigationView

private val nONavMenu = BottomNavigationView.OnNavigationItemSelectedListener{ item ->
    when (item.itemId){
        R.id.itemFragment1 ->{
            supportFragmentManager.commit {

                replace<SFragment>(R.id.frameContainer)
                setReorderingAllowed(true)
                addToBackStack("replacement")
            }
            return@OnNavigationItemSelectedListener true
        }
        R.id.itemFragment2 ->{
            supportFragmentManager.commit {

                replace<TFragment>(R.id.frameContainer)
                setReorderingAllowed(true)
                addToBackStack("replacement")
            }
            return@OnNavigationItemSelectedListener true
        }
        R.id.itemFragment3 ->{
            supportFragmentManager.commit {

                replace<FFragment>(R.id.frameContainer)
                setReorderingAllowed(true)
                addToBackStack("replacement")
            }
            return@OnNavigationItemSelectedListener true
        }
    }
    false
}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        navegation =findViewById(R.id.navmenu)
        navegation.setOnNavigationItemSelectedListener(nONavMenu)

        supportFragmentManager.commit {

            replace<FFragment>(R.id.frameContainer)
            setReorderingAllowed(true)
            addToBackStack("replacement")
        }


    }
}