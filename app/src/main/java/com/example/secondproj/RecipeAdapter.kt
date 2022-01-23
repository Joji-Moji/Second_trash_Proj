package com.example.secondproj

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class RecipeAdapter: RecyclerView.Adapter<RecipeAdapter.RecipeHolder> {//заполняет элементы из списка

    class RecipeHolder(item: View): RecyclerView.ViewHolder(item) {
        fun bind(recipe: Recipe){

        }
    }


}