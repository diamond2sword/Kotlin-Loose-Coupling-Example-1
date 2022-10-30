package src.kotlin.loosecoupling

class Presenter : PresenterAbstract {
    override fun present(model : Model) {
        println(model)
    }
}