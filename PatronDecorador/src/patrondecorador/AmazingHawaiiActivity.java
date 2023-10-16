package patrondecorador;

/**
 *
 * @author Jesus
 */
class AmazingHawaiiActivity extends IDecorador {
    private static final double PRECIO = 931;
    private static final int DURACION = 3;

    public AmazingHawaiiActivity(IDecorado planBase) {
        super(planBase);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + PRECIO;
    }

    @Override
    public int getDuracion() {
        return super.getDuracion() + DURACION;
    }
}
