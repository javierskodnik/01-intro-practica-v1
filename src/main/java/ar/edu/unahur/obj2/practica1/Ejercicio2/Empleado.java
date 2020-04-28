package ar.edu.unahur.obj2.practica1.Ejercicio2;

import com.sun.deploy.util.StringUtils;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;




public abstract class Empleado {

    Scanner ingreso = new Scanner(System.in);
    abstract public double getSueldo();

    private Integer dni;
    private String nombre;
    private String apellido;
    private String email;
    private Double sueldoBase;

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(Double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
}

class DatosDeEmpleados {
    List<Empleado> listaDeEmpleados = new ArrayList<>();

    void cargaDeEmpleados() {
        Scanner ingreso = new Scanner(System.in);

        //void carga() {

        int cantDeEmpleado = 0;
        String respuesta = "1";

        while (cantDeEmpleado < 21 || respuesta == "0") {

            System.out.print("Ingrese el dni: ");
            Integer dni = ingreso.nextInt();

            System.out.print("Ingrese el nombre: ");
            String nombre = ingreso.nextLine();

            System.out.print("Ingrese el apellido: ");
            String apellido = ingreso.nextLine();

            System.out.print("Ingrese el email: ");
            String mail = ingreso.nextLine();

            System.out.print("Ingrese el sueldo base: ");
            double sueldo = ingreso.nextDouble();

            System.out.println("Indique 'A' si es administrativo o 'V' si es vendedor");
            String tipo = ingreso.nextLine();

            if (tipo.equalsIgnoreCase("A")) {
                Administrativo empleado = new Administrativo();

                System.out.print("Ingrese horas extras: ");
                Integer hsExtra = ingreso.nextInt();

                System.out.print("Ingrese cantidad de horas del mes: ");
                Integer hsMes = ingreso.nextInt();

                empleado.setNombre(nombre);
                empleado.setApellido(apellido);
                empleado.setDni(dni);
                empleado.setEmail(mail);
                empleado.setSueldoBase(sueldo);
                empleado.setHsExtra(hsExtra);
                empleado.setHsMes(hsMes);

                listaDeEmpleados.add(empleado);

            } else {
                Vendedor empleado = new Vendedor();

                System.out.print("Ingrese el porcentaje de comisión: ");
                Double porcenComision = ingreso.nextDouble();

                System.out.print("Ingrese el total de ventas: ");
                Integer totalVtas = ingreso.nextInt();


                empleado.setNombre(nombre);
                empleado.setApellido(apellido);
                empleado.setDni(dni);
                empleado.setEmail(mail);
                empleado.setSueldoBase(sueldo);
                empleado.setPorcenComision(porcenComision);
                empleado.setTotalVtas(totalVtas);

                listaDeEmpleados.add(empleado);

            }


            System.out.println("Presione 0 para continuar o 1 para finalizar ");

            respuesta = ingreso.nextLine();

            if (respuesta.equals(1)) {
                cantDeEmpleado = +1;
            }
        }
    }


    void listarEmpleados () {
        String formato = "Dni: %d\tNombre: %s\tApellido: %s\tSueldo: %.2f";

        listaDeEmpleados.forEach(empleado ->
                System.out.println(String.format
                        (formato, empleado.getDni(), empleado.getNombre(), empleado.getApellido(), empleado.getSueldo())));


    }
}



