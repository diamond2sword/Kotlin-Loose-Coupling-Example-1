package src.kotlin.loosecoupling

class Interactor(model : Model, entity : EntityAbstract, presenter : PresenterAbstract) {
    init {
        val request = model
        val response = entity.getResponse(request)
        presenter.present(response)
    }
}