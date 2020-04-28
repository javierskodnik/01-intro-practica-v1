package ar.edu.unahur.obj2.practica1.Ejercicio2;

import com.sun.deploy.util.StringUtils;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Administrativo extends Empleado{

    private Integer hsExtra;
    private  Integer hsMes;
    public double getSueldo(){
        return this.getSueldoBase() * ((hsExtra * 1.5)+hsMes) / hsMes;
    }

    public Integer getHsExtra() {
        return hsExtra;
    }

    public void setHsExtra(Integer hsExtra) {
        this.hsExtra = hsExtra;
    }

    public Integer getHsMes() {
        return hsMes;
    }

    public void setHsMes(Integer hsMes) {
        this.hsMes = hsMes;
    }
}