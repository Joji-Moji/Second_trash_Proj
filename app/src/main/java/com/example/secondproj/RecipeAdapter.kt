package com.example.secondproj

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.secondproj.databinding.RecipeItemBinding

class RecipeAdapter: RecyclerView.Adapter<RecipeAdapter.RecipeHolder>() {//заполняет элементы из списка

        val recipeList = arrayListOf<Recipe>()

    class RecipeHolder(item: View): RecyclerView.ViewHolder(item) {




        val binding = RecipeItemBinding.bind(item) // надуваем наш шаблон для видимости

        fun bind(recipe: Recipe) = with(binding) {   // with оператор позволяющий всей функции использовать binding
            image.setImageResource(recipe.imageId)
            textTitle.text = recipe.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeHolder { // берет разметку recipe_item  и создает класс holder куда передает разметку
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recipe_item, parent, false) // надувает разметку ;)
        return RecipeHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeHolder, position: Int) { // заполнение эелементов
        holder.bind(recipeList[position])
    }

    override fun getItemCount(): Int { // передается размер нашего листа для того чтоб знать сколько раз запустить функцию
        return  recipeList.size
    }

    fun addRecipe (recipe: Recipe){
        recipeList.add(recipe) // добавляет в список
        notifyDataSetChanged()// дает понять что данные внутри изменились, над добавить новый элемент
    }
}