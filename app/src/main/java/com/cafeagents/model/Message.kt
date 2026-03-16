package com.cafeagents.model

data class Message(
    val id: String,
    val content: String,
    val timestamp: Long,
    val isFromUser: Boolean
)
