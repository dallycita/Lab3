
// link del video explicando el código: https://youtu.be/_fZkbjn6edo

fun main() {
    val hamburguesa = Hamburguesa("Hamburguesa con queso", 35.0)
    val pizza = Pizza("Pizza de pepperoni", 50.0)
    val helado = Helado("Helado de vainilla", 20.0)
    val jugo = Jugo("Jugo de naranja", 15.0)

    println(hamburguesa.cocinar())
    println(pizza.cocinar())
    println(helado.cocinar())
    println(jugo.cocinar())

    println(jugo.servir())
    println(helado.comer())

    val descuento = 10.0
    println("Precio con $descuento% de descuento: Q${hamburguesa.precioConDescuento(descuento)}")
}
