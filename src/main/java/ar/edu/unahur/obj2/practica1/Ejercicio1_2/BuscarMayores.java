package ar.edu.unahur.obj2.practica1.Ejercicio1_2;

import java.util.ArrayList;
import java.util.List;

class BuscarMayores {

    public List<Integer> buscarMayores(int numeroEntero, List<Integer> listaDeEnteros) {
        List<Integer> mayores = new ArrayList();

        for(int i=0; i < listaDeEnteros.size(); i++){
            if(listaDeEnteros.get(i) > numeroEntero){
                mayores.add(listaDeEnteros.get(i));
            }
        }
        return mayores;
    }
}
