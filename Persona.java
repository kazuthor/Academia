
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona 
{
    // atributos
    String codigo, cedula, nombre;
    int edad;
    
    private Fecha fechaActual;
    private Fecha fechaIngreso;
    
    double salario;
    // constructor
    public Persona(String codigo, String cedula, String nombre, int edad,double salario){
    this.codigo=codigo;
    this.cedula=cedula;
    this.nombre=nombre;
    this.edad=edad;
    this.salario = salario;
    }
    
    public Persona(){
        this.codigo = "1";
        this.cedula = "1090508722";
        this.nombre = "jaime";
        this.edad = 12;
        this.salario = 138.45;
    }
    //getters & setters
    public String getCodigo(){
     return codigo;
      }
    
    public void setCodigo(String codigo){
     this.codigo=codigo;
      }
    
    public String getCedula(){
     return cedula;
      }
    
    public String getNombre(){
     return nombre;
      }
    
    public int getEdad(){
     return edad;  
     }
    
    public Fecha getFechaActual(){
        return fechaActual;
    }
    
    public Fecha getFechaIngreso(){
        return fechaIngreso;
    }
    
    
    
      public void setCedula(String cedula){
     this.cedula=cedula;
      }
    
    public void setNombre(String nombre){
     this.nombre=nombre;
      }
    
    public void setEdad(int edad){
     this.edad=edad;  
     }
     
     public void setFechaActual(Fecha fechaActual){
     this.fechaActual=fechaActual;  
     }
     
     public void setFechaIngreso(Fecha fechaIngreso){
     this.edad=edad;  
     }
     
     public void setSalario(double salario){
         this.salario = salario;
     }
    
      public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Cedula: " + cedula);
        System.out.println("Código: " + codigo);
    }
    
    public int CalcularExperiencia(){
        int experiencia;
        
        return experiencia = fechaActual.getAño() - fechaIngreso.getAño();
    }
    
    
}
