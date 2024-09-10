package com.example.tugas_pertemuan4

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailEditText = findViewById<EditText>(R.id.email)
        val fullnameEditText = findViewById<EditText>(R.id.fullname)
        val usernameEditText = findViewById<EditText>(R.id.username)
        val passwordEditText = findViewById<EditText>(R.id.password)
        val signupButton = findViewById<AppCompatButton>(R.id.signup_button)

        signupButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val fullname = fullnameEditText.text.toString()
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Membuat pesan Toast berdasarkan input user
            val toastMessage = "Email: $email\nFullname: $fullname\nUsername: $username\nPassword: $password"
            Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show()
        }
    }
}
