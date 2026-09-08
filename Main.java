public class Main{
    public static void main(String[] args) {

        Empleado jefe = new Empleado("Camila");
        Empleado sub = new Empleado("Carlos");
        Empleado sub1 = new Empleado("Ana");

        sub.jefe = jefe;
        sub1.jefe = jefe;
        jefe.subordinado[0] = sub;
        jefe.subordinado[1] = sub1;

        System.out.println("El jefe de " + sub.nombre + " es: " + sub.jefe.nombre);
        System.out.println("El jefe de " + sub1.nombre + " es: " + sub1.jefe.nombre);
        System.out.println("Los subordinados de " + jefe.nombre + " son: " + jefe.subordinado[0].nombre + " y " + jefe.subordinado[1].nombre);
}
}