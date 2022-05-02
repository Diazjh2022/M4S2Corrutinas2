package com.example.m4s2corrutinas2.rutina2

import com.example.m4s2corrutinas2.rutina1.secuenciaLargaDuracion
import kotlinx.coroutines.delay


fun main() {
    println("secuencia 1 " + Thread.currentThread().name)
    secuenciaLargaDuracion("secuencia 2 con tiempo de espera: 10 segundos pendiente por actividad ")
    println("secuencia 3 " + Thread.currentThread().name)

    fun secuenciaLargaDuracion(mensaje: String) {
        println(mensaje + Thread.currentThread().name)
        Thread.sleep(10000)
    }

   suspend fun demoracorrutina (mensaje: String) {
        println(mensaje + Thread.currentThread().name)
        delay(timeMillis = 5000)

    }
}

