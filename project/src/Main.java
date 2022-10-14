public class Main {
    public static void main(String[] args) {

        System.out.println(suma(10,10,10));

        coche micoche=new coche();
        micoche.AñadirPuertas();
        micoche.AñadirPuertas();
        micoche.AñadirPuertas();

        System.out.println("Numero de puertas del coche:" + micoche.puerta);
    }
    public static int suma(int a , int b, int c){
        return a+b+c;

    }
}

class coche
{
    public int puerta=0;

    public void AñadirPuertas(){
        this.puerta++;
    }


}