package com.mugiwara.examen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

// Adapter per RecyclerView
class TasquesAdapter : RecyclerView.Adapter<TasquesAdapter.TascaViewHolder>() {


    private var tasques = listOf<Tasca>()

    fun setTasques(novesTasques: List<Tasca>) {
        tasques = novesTasques
        notifyDataSetChanged()
    }
    class TascaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TascaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tasca, parent, false)
        return TascaViewHolder(view)
    }

    override fun onBindViewHolder(holder: TascaViewHolder, position: Int) {
        holder.renderitza(tasques[position])
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}

private fun TasquesAdapter.TascaViewHolder.renderitza(tasca: Tasca) {
    TODO("Not yet implemented")
}
