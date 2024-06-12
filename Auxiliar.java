

public class Auxiliar extends Persona
{
    private String cargo;
    private double auxilioTransporte;
     
    
    public Auxiliar(String codigo,String cedula, String nombre,double salario,int edad,
    String cargo, double auxilioTransporte)
    {   super(codigo, cedula, nombre, edad,salario);
        this.cargo = cargo;
        this.auxilioTransporte = auxilioTransporte;
    }

    public String getCargo(){
        return cargo;
    }
    
    public double auxilioTransporte(){
        return auxilioTransporte;
    }
     
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public void setAuxilioTransporte(double auxilioTransporte){
        this.auxilioTransporte = auxilioTransporte;
    }
    
    
}
