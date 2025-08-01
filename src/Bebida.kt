abstract class Bebida(nombre: String, precio: Double) : Alimento(nombre, precio) {
    abstract fun servir(): String
}

class Jugo(nombre: String, precio: Double) : Bebida(nombre, precio) {
    override fun cocinar(): String {
        return "Exprimiendo el jugo: $nombre"
    }

    override fun servir(): String {
        return "Sirviendo el jugo: $nombre"
    }
}
