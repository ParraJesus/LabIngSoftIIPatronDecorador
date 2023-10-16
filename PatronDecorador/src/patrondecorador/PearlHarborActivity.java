package patrondecorador;

/**
 *
 * @author Jesus
 */

public class PearlHarborActivity extends IDecorador 
{
    private static final double PRECIO = 653;
    private static final int DURACION = 7;

    public PearlHarborActivity(IDecorado planBase) 
    {
        super(planBase);
    }

    @Override
    public double getPrecio() 
    {
        return super.getPrecio() + PRECIO;
    }

    @Override
    public int getDuracion() 
    {
        return super.getDuracion() + DURACION;
    }
}
