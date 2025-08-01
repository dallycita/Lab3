abstract class Alimento(val nombre: String, val precio: Double) {
    abstract fun cocinar(): String
}

class Hamburguesa(nombre: String, precio: Double) : Alimento(nombre, precio) {
    override fun cocinar(): String {
        return "Asando la hamburguesa: $nombre"
    }
}

class Pizza(nombre: String, precio: Double) : Alimento(nombre, precio) {
    override fun cocinar(): String {
        return "Horneando la pizza: $nombre"
    }
}
