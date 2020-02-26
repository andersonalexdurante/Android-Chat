package com.example.androidchat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MessageAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val items: List<String> = listOf("Um","Dois","Três")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val card = LayoutInflater.from(parent.context).inflate(R.layout.message_card, parent, false)
        return MessageViewHolder(card)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
       val currentItem = items[position]
        if(holder is MessageViewHolder){
            holder.tvMessage.text = currentItem;
        }
    }

    class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvMessage: TextView = itemView.findViewById(R.id.tvMessage)
    }
}