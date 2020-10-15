package com.shoppinglistapp.ui.shoppinglist

import com.shoppinglistapp.data.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}