package com.example.kurkin_library

import java.util.Date
import java.util.UUID

data class Book (
    val bookID: UUID = UUID.randomUUID(),
    var title: String = "",
    var author: String = "",
    var bookDate: Date = Date(),
    var price: Float = 0.0f,
    var rented: Boolean = false
)
