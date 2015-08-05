
package ejemplogit;


public class Ejemplogit {
   public static void nuevaLinea () {
System.out.println ("");
}
public static void tresLineas () {
    System.out.println ("");
nuevaLinea (); nuevaLinea (); nuevaLinea ();
}
public static void imprimirTiempo(int hora, int minuto) {
System.out.print (hora);
System.out.print (":");
System.out.println (minuto);
}

   
    public static void main(String[] args) {
          int x = 54;
    double f = 85;
    int hr = 5;
    int mint = 45;
    
          
System.out.println ("Primera linea.");
tresLineas ();
System.out.println ("Segunda linea.");
nuevaLinea ();
System.out.println("Elevacion");
System.out.println(Math.pow(2.0, 10.0));
tresLineas ();
System.out.println("Divicion");
System.out.println(f/x);
imprimirTiempo(hr, mint);
      
    }
    
}
