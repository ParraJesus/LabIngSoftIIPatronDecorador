package patrondecorador;


class PaqueteBase implements IDecorado 
{
    private static final double PRECIO_BASE = 7000;
    private static final int DURACION_BASE = 5;

    @Override
    public double getPrecio() {
        return PRECIO_BASE;
    }

    @Override
    public int getDuracion() {
        return DURACION_BASE;
    }
}
