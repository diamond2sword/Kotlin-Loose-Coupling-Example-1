package src.kotlin.loosecoupling

class Entity : EntityAbstract {
    override fun getResponse(model : Model) : Model {
        return Model(1)
    }
}