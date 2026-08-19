package org.example

import com.google.firebase.FirebaseApp

fun request() {

    print("Initiating server link\n.\n.\n.\n.\n.\n.")

    try{
        FirebaseApp.initializeApp(Initialization.key)
    }
    catch(e: Exception) {
        e.printStackTrace()
        println("Error: ${e.message}")
    }
}