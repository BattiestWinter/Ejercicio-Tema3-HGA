public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = Suma(10, 5, 2);
        System.out.println(resultado);

        coche miCoche = new coche();
        miCoche.AñadirPuertas();
        System.out.println(miCoche.puertas);
    }

    //Parte 1
    public static int Suma(int a, int b, int c) {
        return a + b + c;
    }
}

//Parte 2
class coche{
    int puertas = 0;

    public void AñadirPuertas(){
        puertas++;
    }
}
