package datos;

public class Persona {

    private String ced;
    private String nom;
    private String ape;
    private String gen;
    private float sue;

    //creamos el constructor
    public Persona() {
    }

    //creamos los metodos get y set
    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
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

    public String mostrar(int k) {
        return "Persona No " + k + "\ncedula:" + ced +
                "\nnombre:" + nom + "\napellido:" + ape +
                "\ngenero:" + gen +
                "\nsueldo:" + sue;
    }


}
