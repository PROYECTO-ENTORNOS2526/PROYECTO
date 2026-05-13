package proyecto_videojuegos;

public class Categoria {

    private int idCategoria;
    private String nombre;
    private String descripcion;

    public Categoria(int idCategoria, String nombre, String descripcion) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }


    public void modificarCategoria(String nuevoNombre, String nuevaDescripcion) {
        this.nombre = nuevoNombre;
        this.descripcion = nuevaDescripcion;
        System.out.println("Categoría modificada correctamente.");
    }

    public void eliminarCategoria() {
        System.out.println("Categoría eliminada: " + nombre);
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "idCategoria=" + idCategoria +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
    
}