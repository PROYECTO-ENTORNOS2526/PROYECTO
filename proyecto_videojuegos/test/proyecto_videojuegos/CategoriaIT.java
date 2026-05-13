/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package proyecto_videojuegos;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hecaji958
 */
public class CategoriaIT {
   
    /**
     * Test of crearCategoria method, of class Categoria.
     */
    @Test
    public void testCategoria() {
        Categoria categoria = new Categoria(
                1,
                "Acción",
                "Videojuegos de acción y aventura"
        );

        assertEquals(1, categoria.getIdCategoria());
        assertEquals("Acción", categoria.getNombre());
        assertEquals("Videojuegos de acción y aventura", categoria.getDescripcion());
    }


   
    
}
