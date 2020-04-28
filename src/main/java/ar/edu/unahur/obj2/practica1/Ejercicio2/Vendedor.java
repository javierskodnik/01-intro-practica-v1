package ar.edu.unahur.obj2.practica1.Ejercicio2;


class Vendedor extends Empleado {

    private double porcenComision=0.10;
    private Integer totalVtas;
    public double getSueldo(){
        return this.getSueldoBase() + (porcenComision*totalVtas/100);
    }

    public double getPorcenComision() {
        return porcenComision;
    }

    public void setPorcenComision(double porcenComision) {
        this.porcenComision = porcenComision;
    }

    public Integer getTotalVtas() {
        return totalVtas;
    }

    public void setTotalVtas(Integer totalVtas) {
        this.totalVtas = totalVtas;
    }
}