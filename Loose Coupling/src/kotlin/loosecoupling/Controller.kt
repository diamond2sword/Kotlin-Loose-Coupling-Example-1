package src.kotlin.loosecoupling

class Controller {
    fun mockInteractor(model : Model) {
        Interactor(model, Entity(), Presenter())
    }
}