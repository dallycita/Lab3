fun Alimento.precioConDescuento(porcentaje: Double): Double {
    return precio * (1 - porcentaje / 100)
}
