public class Empleado {

    public String nombre;
    public Empleado jefe;
    public Empleado[] subordinado;

    public Empleado(String n) {
        nombre = n;
        subordinado = new Empleado[5];    
        
    }
}