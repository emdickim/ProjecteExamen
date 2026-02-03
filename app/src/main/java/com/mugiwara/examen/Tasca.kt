package com.mugiwara.examen

import com.mugiwara.examen.Categoria
import com.mugiwara.examen.Estat

data class Tasca(
    val id: Int,
    val nom: String,
    val categoria: Categoria,
    val data: String,
    val estat: Estat
)