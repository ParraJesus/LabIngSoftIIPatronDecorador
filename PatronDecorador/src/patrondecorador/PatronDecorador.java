package patrondecorador;

/**
 *  Jesus Gabriel Parra Dugarte
 */
public class PatronDecorador {
    public static void main(String[] args) {
        IDecorado paqueteBase = new PaqueteBase();
        IDecorado paqueteDecorado = new NatureActivity(new PearlHarborActivity(paqueteBase));

        System.out.println("Precio total: $" + paqueteDecorado.getPrecio());
        System.out.println("Duración total: " + paqueteDecorado.getDuracion() + " días");
    }
    
}
