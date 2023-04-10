public abstract class PoligonoRegular {
    private int numLados;
    private float tamLados;

    public PoligonoRegular(int numLados, float tamLados) {
        this.numLados = numLados;
        this.tamLados = tamLados;
    }

    public float getTamLados() {
        return tamLados;
    }

    public float calculaPerimetro(float l, float a){
        return l+a;
    }
     abstract float calculaArea();
}
