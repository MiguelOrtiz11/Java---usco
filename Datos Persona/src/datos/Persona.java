package datos;

public class Persona {
    private String nom;
    private String ape;
    private String ced;
    private String gen;
    private float sue;

    // Creamos el constructor
    public Persona(String nom, String ape, String ced, String gen, float sue) {
        this.nom = nom;
        this.ape = ape;
        this.ced = ced;
        this.gen = gen;
        this.sue = sue;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public float getSue() {
        return sue;
    }

    public void setSue(float sue) {
        this.sue = sue;
    }

    public String mostrar() {
        return "datos.Persona{" +
                "nombre ='" + nom + '\'' +
                ", apellido ='" + ape + '\'' +
                ", cedula ='" + ced + '\'' +
                ", genero ='" + gen + '\'' +
                ", sueldo =" + sue +
                '}';
    }
}
