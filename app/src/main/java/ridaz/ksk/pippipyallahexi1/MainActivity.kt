package ridaz.ksk.pippipyallahexi1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Rida Dhimni
 * 28/06/2021
 **/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val villes = ArrayList<String>()
        villes.add("Marrakech")
        villes.add("Casablanca")

        ListVillepassage.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        ListVillepassage.adapter = PassageVillesAdapter(villes)

    }
}