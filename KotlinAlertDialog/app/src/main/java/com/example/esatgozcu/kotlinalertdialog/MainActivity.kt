package com.example.esatgozcu.kotlinalertdialog

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // Butona basılınca..
    fun button(view: View)
    {
        // AlertDialog nesnemizi üretiyoruz
        val alert = AlertDialog.Builder(this)

        // Başlık
        alert.setTitle("Çıkış")
        //Mesaj
        alert.setMessage("Çıkış yapmak istediğinize emin misiniz?")
        //Herhangi bir boşluğa basınca kapanmaması için true olursa kapanır
        //Geri tuşununu da pasif hale getiriyoruz
        alert.setCancelable(false);
        //AlertDialog'un iconunu belirliyoruz
        alert.setIcon(R.drawable.resim);

        alert.setPositiveButton("Evet") { dialogInterface: DialogInterface, i: Int ->
            // Evet butonuna tıklayınca olacaklar
            Toast.makeText(applicationContext,"Evet",Toast.LENGTH_LONG).show() }

        alert.setNegativeButton("Hayır") {dialogInterface: DialogInterface, i: Int ->
            // Hayır butonuna tıklayınca olacaklar
            Toast.makeText(applicationContext,"Hayır",Toast.LENGTH_LONG).show() }
        alert.show()
    }
}
