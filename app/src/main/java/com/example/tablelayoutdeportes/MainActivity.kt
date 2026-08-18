package com.example.tablelayoutdeportes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // La tabla se define completamente de forma declarativa en el XML;
    // esta actividad únicamente infla la vista. Si se requiriera cargar
    // los resultados dinámicamente, se podrían agregar TableRow por
    // código usando tableLayout.addView(fila).
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
