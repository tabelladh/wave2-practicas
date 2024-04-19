package CarreraSelva;

public class Categoria {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private int id;
    private String nombre;
    private String descripcion;

    public Float getCostoInscripcionMenor() {
        return costoInscripcionMenor;
    }

    public void setCostoInscripcionMenor(Float costoInscripcionMenor) {
        this.costoInscripcionMenor = costoInscripcionMenor;
    }

    public Float getCostoInscripcionMayor() {
        return costoInscripcionMayor;
    }

    public void setCostoInscripcionMayor(Float costoInscripcionMayor) {
        this.costoInscripcionMayor = costoInscripcionMayor;
    }

    private Float costoInscripcionMenor;

    private Float costoInscripcionMayor;
    public Categoria(int id, String nombre, String descripcion, Float costoInscripcionMenor, Float costoInscripcionMayor) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costoInscripcionMenor = costoInscripcionMenor;
        this.costoInscripcionMayor = costoInscripcionMayor;
    }
}

