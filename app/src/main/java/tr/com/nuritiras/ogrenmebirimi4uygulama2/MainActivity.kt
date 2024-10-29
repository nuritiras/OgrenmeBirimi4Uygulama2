package tr.com.nuritiras.ogrenmebirimi4uygulama2

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun onClickKontrolEt(view: View) {

        val textSayi1=findViewById<EditText>(R.id.editTextSayi1)
        val textSayi2=findViewById<EditText>(R.id.editTetSayi2)
        val sayi1=textSayi1.text.toString().toInt()
        val sayi2=textSayi2.text.toString().toInt()

        if(sayi1>sayi2)
            Toast.makeText(this,"1. Sayı Daha Büyüktür.",Toast.LENGTH_LONG).show()
        if(sayi2>sayi1)
            Toast.makeText(this,"2. Sayı Daha Büyüktür.",Toast.LENGTH_LONG).show()
        if(sayi1==sayi2)
            Toast.makeText(this,"İki Sayı Birbirine Eşittir.", Toast.LENGTH_LONG).show()
    }

}