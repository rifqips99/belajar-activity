package io.github.rifqips.belajar1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var buttonsubmit: Button
    private lateinit var etnama: EditText
    private lateinit var etnim: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etnama = findViewById(R.id.etnama)
        etnim = findViewById(R.id.etnim)
        buttonsubmit = findViewById(R.id.btn_submit)

        buttonsubmit.setOnClickListener {
            val nama = etnama.text.toString()
            Toast.makeText(this,nama,Toast.LENGTH_SHORT).show()

            val intentGotoData = Intent(this, DataActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            }
            startActivity(intentGotoData)
        }
    }
}