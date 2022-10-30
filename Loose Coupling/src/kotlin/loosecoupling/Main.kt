package src.kotlin.loosecoupling

fun main() {
    println("Hello World")
    Controller().mockInteractor(Model())
}