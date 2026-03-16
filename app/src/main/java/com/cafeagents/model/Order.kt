package com.cafeagents.model

data class Order(
    val id: String,
    val items: List<String>,
    val totalAmount: Double,
    val status: String,
    val timestamp: Long
)
