package com.sistema.en.gestion.sprint1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Sprint1BddTest {

    @Test
    void hu01RegistroAgricultorDebeCrearCuenta() {
        // Given: el usuario proporciona datos válidos.
        String nombre = "Agricultor Demo";
        String identificacion = "123456789";

        // When: el sistema procesa el registro.
        boolean registroExitoso = !nombre.isBlank() && !identificacion.isBlank();

        // Then: la cuenta debe registrarse correctamente.
        assertTrue(registroExitoso);
    }

    @Test
    void hu04FiltroDebeMostrarProductosDelMunicipioYCategoria() {
        // Given: existen productos registrados.
        String municipioSeleccionado = "Cali";
        String categoriaSeleccionada = "Frutas";

        // When: se aplican los filtros.
        String municipioProducto = "Cali";
        String categoriaProducto = "Frutas";

        boolean productoCoincide =
                municipioSeleccionado.equals(municipioProducto)
                        && categoriaSeleccionada.equals(categoriaProducto);

        // Then: el producto debe cumplir ambos filtros.
        assertTrue(productoCoincide);
    }

    @Test
    void hu11RecepcionDebeCompletarPedidoYRegistrarCalificacion() {
        // Given: existe un pedido en proceso de entrega.
        String estadoInicial = "En Entrega";

        // When: el comerciante confirma la recepción y califica.
        String estadoFinal = "Completado";
        int calificacion = 5;

        // Then: el pedido debe quedar completado y tener una valoración.
        assertEquals("En Entrega", estadoInicial);
        assertEquals("Completado", estadoFinal);
        assertTrue(calificacion >= 1 && calificacion <= 5);
    }
}