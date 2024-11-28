package com.example.neurasecure

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter(var postArrayList: List<Post>, var context: Context): RecyclerView.Adapter<adapter.ViewHolder>() {






    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.each_post, parent, false)
        return ViewHolder(itemview)
    }

    override fun getItemCount(): Int {
        return postArrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post = postArrayList[position]
        holder.content.text = post.content
        holder.title.text = post.title
        holder.category.text = post.category



    }

    class ViewHolder(itemview: View):RecyclerView.ViewHolder(itemview) {
        var content = itemview.findViewById<TextView>(R.id.description)
        var category  = itemview.findViewById<TextView>(R.id.category)
        var title  = itemview.findViewById<TextView>(R.id.title)

    }

}

