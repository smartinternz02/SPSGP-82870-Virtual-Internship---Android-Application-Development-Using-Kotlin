package com.example.groceryapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GroceryViewModel(
    private val repository: GroceryRepository
) : ViewModel() {

    @OptIn(DelicateCoroutinesApi::class)
    fun insert(item: GroceryItems) =
        GlobalScope.launch {
            repository.insert(item)
        }

    @OptIn(DelicateCoroutinesApi::class)
    fun delete(item: GroceryItems) = GlobalScope.launch {
        repository.delete(item)
    }

    fun getAllGroceryItems() = repository.getAllGroceryItems()

}