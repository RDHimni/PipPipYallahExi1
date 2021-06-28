package ridaz.ksk.pippipyallahexi1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Rida Dhimni
 * 28/06/2021
 **/


class PassageVillesAdapter(private var dataSet: ArrayList<String>) : RecyclerView.Adapter<PassageVillesAdapter.ViewHolder>() {



    ////////////////////////////////////////////////////////////////////////////////////
    /////////////******************class MyViewHolder()***********************//////////////
    ////////////////////////////////////////////////////////////////////////////////////

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val VilleTv: TextView

        init {
            // Define click listener for the ViewHolder's View.
            VilleTv = itemView.findViewById(R.id.passageVilleTv)
        }


    }


    ////////////////////////////////////////////////////////////////////////////////////
    /////////////******************onCreateViewHolder***********************//////////////
    ////////////////////////////////////////////////////////////////////////////////////

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.ville_passage_item, viewGroup, false)

        return ViewHolder(view)
    }




    ////////////////////////////////////////////////////////////////////////////////////
    /////////////******************onBindViewHolder()***********************//////////////
    ////////////////////////////////////////////////////////////////////////////////////

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.VilleTv.text = dataSet[position]
    }



    ////////////////////////////////////////////////////////////////////////////////////
    /////////////******************onBindViewHolder()***********************//////////////
    ////////////////////////////////////////////////////////////////////////////////////
    override fun getItemCount() = dataSet.size

}
