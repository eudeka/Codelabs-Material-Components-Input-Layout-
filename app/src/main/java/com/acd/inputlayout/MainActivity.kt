package com.acd.inputlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var edtNama:EditText
    private lateinit var edtAlamat:EditText
    private lateinit var edtUniv:EditText
    private lateinit var edtHobby:EditText
    private lateinit var btnKirim:Button
    private lateinit var btnReset:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNama = findViewById(R.id.edt_nama)
        edtAlamat = findViewById(R.id.edt_alamat)
        edtUniv = findViewById(R.id.edt_univ)
        edtHobby = findViewById(R.id.edt_hobby)
        btnKirim = findViewById(R.id.btn_kirim)
        btnReset = findViewById(R.id.btn_reset)

        btnKirim.setOnClickListener {
            if (edtNama.text.isNullOrEmpty() || edtAlamat.text.isNullOrEmpty() || edtUniv.text.isNullOrEmpty() || edtHobby.text.isNullOrEmpty()){
                Toast.makeText(this,"Lengkapi form terlebih dahulu!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this,"Berhasil mengisi form!", Toast.LENGTH_SHORT).show()
            }
        }

        btnReset.setOnClickListener {
            edtNama.setText("")
            edtAlamat.setText("")
            edtUniv.setText("")
            edtHobby.setText("")
        }

    }
}