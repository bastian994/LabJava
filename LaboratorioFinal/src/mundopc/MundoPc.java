package mundopc;
import com.gm.mundopc.*;
public class MundoPc {
    public static void main(String[] args) {
        Raton raton1= new Raton("Usb", "SONY");
        Raton raton2 = new Raton("VGA", "samsung");

        Monitor monitor1 = new Monitor("LG", 21);
        Monitor monitor2 = new Monitor( "Caquita", 18);

        Teclado teclado1= new Teclado ( "Usb", "sony");

        Computadora computadora1= new Computadora("HP", monitor1, teclado1, raton1);
        Orden orden1= new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();

    }
}
