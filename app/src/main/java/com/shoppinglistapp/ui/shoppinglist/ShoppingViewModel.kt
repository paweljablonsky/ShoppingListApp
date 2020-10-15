package com.shoppinglistapp.ui.shoppinglist

import androidx.lifecycle.ViewModel
import com.shoppinglistapp.data.entities.ShoppingItem
import com.shoppinglistapp.repositories.ShoppingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShoppingViewModel (
    private val repository: ShoppingRepository
): ViewModel() {

    fun insertWithReplace(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.insertWithReplace(item)
    }
    fun delete(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.delete(item)
    }
    fun getAllShoppingItems() = repository.getAllShoppingItems()
}