package com.example.groceryapp

class GroceryRepository(
    private val db: GroceryDatabase
) {
    fun insert(item: GroceryItems) = db.getGroceryDao().insert(item)

    fun delete(item: GroceryItems) = db.getGroceryDao().delete(item)

    fun getAllGroceryItems() = db.getGroceryDao().getAllGroceryitems()
}