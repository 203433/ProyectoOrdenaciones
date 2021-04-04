
import java.util.Random;
import java.util.ArrayList;

//Marisol Solis Lopez 203411
//Azul Gissele Briones Zavala 203720
//Enrique Verdi Cruz 203433

public class Main {
    public static void main(String [] args) {

        int cantidad = 100; //Cantidad de objetos aleatorios a generar

        Sort s = new Sort<>();

        System.out.println("\nSe generarán 4 listas de objetos para mostrar su ordenamiento por distintos metodos "+
                "(Estos serán ordenados por el numero)  \n\n1) Ordenamiento QuickSort\n");

        //Primer lista
        ArrayList<Datos> lista1 = generarObjetos(cantidad);
        //Ordenada por QuickSort
        System.out.println("Lista Original: " + lista1);
        s.quickSort(lista1, 0, lista1.size()-1);
        System.out.println("Lista ordenada: " + lista1);

        System.out.println("\n2) Ordenamiento MergeSort\n");

        //Segunda lista
        ArrayList<Datos> lista2 = generarObjetos(cantidad);
        //Ordenada por MergeSort
        System.out.println("Lista Original: " + lista2);
        s.mergesort(lista2, 0, lista2.size()-1);
        System.out.println("Lista Ordenada: " + lista2);

        System.out.println("\n3) Ordenamiento CycleSort\n");

        //Tercer lista
        ArrayList<Datos> lista3 = generarObjetos(cantidad);
        //Ordenada por CycleSort
        System.out.println("Lista Original: " + lista3);
        s.cycleSort(lista3, lista3.size());
        System.out.println("Lista Ordenada: "+ lista3);

        System.out.println("\n4) Ordenamiento Fisher-Yates\n");

        //Cuarta lista
        ArrayList<Datos> lista4 = generarObjetos(cantidad);
        //Ordenada por Fisher-Yates
        System.out.println("Lista Original: " + lista4);
        s.fisherYates(lista4);
        System.out.println("Lista Ordenada: "+ lista4);

    }

    private static ArrayList<Datos> generarObjetos(int cantidad) {
        Random rn = new Random();
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<Datos> list = new ArrayList<>();
        for(int i = 0; i < cantidad; i++){
            int numero = rn.nextInt(10001);
            int posicion = rn.nextInt(alfabeto.length());
            String letra = Character.toString(alfabeto.charAt(posicion));
            //System.out.println("Numero: "+numero+" | Letra: "+letra);
            Datos dato = new Datos(numero, letra);
            list.add(dato);
        }
        return list;
    }
}
