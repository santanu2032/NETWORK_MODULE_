package org.example

import com.google.firebase.FirebaseOptions


public data class Value(
    val project_id: String="",
    val apikey: String="",
    public val application_id: String=""
)

object Initialization {

    private val credentials= Value()

    val key: FirebaseOptions= FirebaseOptions.Builder()
        .setProjectId(credentials.project_id.toString())
        .setApiKey(credentials.apikey.toString())
        .setApplicationId(credentials.application_id.toString())
    .build()

}

