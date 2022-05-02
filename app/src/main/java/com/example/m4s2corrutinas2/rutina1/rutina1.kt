package com.example.m4s2corrutinas2.rutina1

fun main(){

    println("secuencia 1 " + Thread.currentThread().name)
    secuenciaLargaDuracion("secuencia 2 con tiempo de espera: 10 segundos ")
    println("secuencia 3 " + Thread.currentThread().name)

    secuenciaLargaDuracion2("secuencia 4 con tiempo de espera: 5 segundos ")




}

fun secuenciaLargaDuracion(mensaje: String){
    println(mensaje + Thread.currentThread().name)
    Thread.sleep(10000)
}
fun secuenciaLargaDuracion2(mensaje: String) {
    println(mensaje + Thread.currentThread().name)
    Thread.sleep(5000)
}
