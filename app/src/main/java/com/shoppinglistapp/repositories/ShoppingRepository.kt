package com.shoppinglistapp.repositories

import com.shoppinglistapp.data.ShoppingDatabase
import com.shoppinglistapp.data.entities.ShoppingItem

class ShoppingRepository (
    private val db: ShoppingDatabase
){
    suspend fun insertWithReplace(item: ShoppingItem) = db.getShoppingDao().insertWithReplace(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().deleteItem(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}