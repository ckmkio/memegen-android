package io.ckmk.memegen.adapter.home

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import io.ckmk.memegen.databinding.ItemGifBinding
import io.ckmk.memegen.model.Gif

class HomeRecyclerViewAdapter(
    private val context: Context,
    private val gifs: List<Gif>?
) : RecyclerView.Adapter<HomeRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemGifBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        gifs?.get(position)?.let {
            holder.textView.text = it.title
            Glide.with(context).asGif().load("https://media.giphy.com/media/${it.id}/giphy.gif").into(holder.imageView)
        }
    }

    override fun getItemCount(): Int = gifs?.size ?: 0

    inner class ViewHolder(binding: ItemGifBinding) : RecyclerView.ViewHolder(binding.root) {
        val imageView: ImageView = binding.imageView
        val textView: TextView = binding.textView
    }
}