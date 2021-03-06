package com.seggsmen.finalapp.logic

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.media.Image
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.seggsmen.finalapp.R
import com.seggsmen.finalapp.ViewPastMealActivity
import com.seggsmen.finalapp.databinding.CardSavedMealRowBinding
import com.seggsmen.finalapp.util.BitmapConverter

class SavedMealListAdapter(private val meals: List<NewMeal>, private val context: Context, private val listener: (position: Int) -> Unit) :
    RecyclerView.Adapter<SavedMealListAdapter.ViewHolder>() {

    var selectedPos = RecyclerView.NO_ID.toInt()

    //Define variables for view that can be accessed in onBindViewHolder()
    inner class ViewHolder(binding: CardSavedMealRowBinding) : RecyclerView.ViewHolder(binding.root) {
        val mealName: TextView = binding.textView15
        val mealImage: ImageView = binding.imageView2
    }

    //Initial construction
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding = CardSavedMealRowBinding.inflate(
            LayoutInflater.from(viewGroup.context), viewGroup, false)

        return ViewHolder(binding)
    }

    //Called after construction, whenever view is loaded onto screen, and whenever notified
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.mealName.text = meals[position].name

        if (meals[position].imageString != null && meals[position].imageString != Const.STRING_NO_VALUE) {
            val imageBitmap: Bitmap = BitmapConverter.convertStringToBitmap(meals[position].imageString)
            viewHolder.mealImage.setImageBitmap(imageBitmap)
        }

        if (selectedPos == position) {
            viewHolder.itemView.backgroundTintList = ContextCompat.getColorStateList(context, R.color.dark_peach)
        } else {
            viewHolder.itemView.backgroundTintList = ContextCompat.getColorStateList(context, R.color.peach)
        }

        viewHolder.itemView.setOnClickListener {
            val oldPos = selectedPos
            selectedPos = position
            notifyItemChanged(position)
            notifyItemChanged(oldPos)
            listener.invoke(position)
        }
    }

    override fun getItemCount() = meals.size

    public fun isFoodSelected(): Boolean {
        return when {
            selectedPos < 0 -> {
                false
            }
            selectedPos > meals.size-1 -> {
                false
            }
            else -> {
                true
            }
        }
    }

    public fun getSelectedFood(): NewMeal? {
         return when {
            selectedPos < 0 -> {
                null
            }
            else -> {
                meals[selectedPos]
            }
        }
    }

    public fun getSelectedPos(): Int? {
        return if (selectedPos < 0) null else selectedPos
    }
}