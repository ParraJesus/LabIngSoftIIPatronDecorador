package patrondecorador;

/**
 * @author Jesus
 */

class NatureActivity extends IDecorador {
    private static final double PRECIO = 720;
    private static final int DURACION = 5;

    public NatureActivity(IDecorado planBase) {
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
