package me.mehdi.playavd

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(context: Context, list: Array<Int>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    val mContext = context
    val mList = list
    lateinit var mClickListener:ItemClickListener

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val title = itemView.findViewById<TextView>(R.id.itemTitle)
        val image = itemView.findViewById<ImageView>(R.id.itemImage)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(mList[position])
        holder.title.setText(mList[position].toString())
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(mContext).inflate(R.layout.list_item_layout, parent, false);
        val image = itemView.findViewById<ImageView>(R.id.itemImage)
        image.setOnClickListener { mClickListener.onClick(image) }
        return ViewHolder(itemView)
    }

    fun setItemClickListener(cl: ItemClickListener){
        mClickListener = cl
    }

    interface ItemClickListener {
        fun onClick(image:ImageView)
    }

}
