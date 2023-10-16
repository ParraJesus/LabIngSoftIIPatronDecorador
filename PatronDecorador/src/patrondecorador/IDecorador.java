package patrondecorador;

/**
 *
 * @author Jesus
 */
abstract class IDecorador implements IDecorado {
    private IDecorado planBase;

    public IDecorador(IDecorado planBase) {
        this.planBase = planBase;
    }

    @Override
    public double getPrecio() {
        return planBase.getPrecio();
    }

    @Override
    public int getDuracion() {
        return planBase.getDuracion();
    }
}
