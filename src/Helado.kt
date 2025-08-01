interface Postre {
    fun comer(): String
}

class Helado(nombre: String, precio: Double) : Alimento(nombre, precio), Postre {
    override fun cocinar(): String {
        return "Enfriando el helado: $nombre"
    }

    override fun comer(): String {
        return "Comiendo el helado: $nombre"
    }
}
