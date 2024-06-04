package com.dicoding.l_health

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var profileImage: ImageView
    private lateinit var editProfileImage: ImageButton
    private lateinit var fullName: EditText
    private lateinit var nickname: EditText
    private lateinit var birthDate: EditText
    private lateinit var email: EditText
    private lateinit var phoneNumber: EditText
    private lateinit var genderSpinner: Spinner
    private lateinit var continueButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil) // Change the layout file here

        profileImage = findViewById(R.id.profileImage)
        editProfileImage = findViewById(R.id.editProfileImage)
        fullName = findViewById(R.id.fullName)
        nickname = findViewById(R.id.nickname)
        birthDate = findViewById(R.id.birthDate)
        email = findViewById(R.id.email)
        phoneNumber = findViewById(R.override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val btnMulai: Button = findViewById(R.id.btn_mulai)
            btnMulai.setOnClickListener {
                Toast.makeText(this, "Tombol Mulai Diklik", Toast.LENGTH_SHORT).show()
