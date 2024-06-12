

/**
 * Write a description of class Administrativo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrativo extends Persona
{
    private String cargo;
    private int añosExperiencia;
    private String numeroExtensionTelefonica;

    public Administrativo(String codigo,String cedula, String nombre,double salario,int edad,String cargo, 
                          int añosExperiencia, String numeroExtensionTelefonica) 
    {
        super(codigo, cedula, nombre, edad,salario);
        this.cargo = cargo;
        this.añosExperiencia = añosExperiencia;
        this.numeroExtensionTelefonica = numeroExtensionTelefonica;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public String getNumeroExtensionTelefonica() {
        return numeroExtensionTelefonica;
    }

    public void setNumeroExtensionTelefonica(String numeroExtensionTelefonica) {
        this.numeroExtensionTelefonica = numeroExtensionTelefonica;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Cargo: " + cargo);
        System.out.println("Años de experiencia: " + añosExperiencia);
        System.out.println("Número de extensión telefónica: " + numeroExtensionTelefonica);
    }
}
