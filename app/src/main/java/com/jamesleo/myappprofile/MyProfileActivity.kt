package com.jamesleo.myappprofile

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_my_profile.*

class MyProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)
        ambilData()
    }

    private fun ambilData() {
        val bundle = intent.extras
        val nama = bundle!!.getString("Nama")
        val gender = bundle.getString("gender")
        val email = bundle.getString("Email")
        val telp = bundle.getString("Telp")
        val alamat = bundle.getString("Alamat")

        txtName.text = nama
        txtGender.text = gender
        txtEmail.text = email
        txtTelp.text = telp
        txtAddress.text = alamat
    }
}