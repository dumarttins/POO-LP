public class Quadrado extends PoligonoRegular{
    public Quadrado(int numLados, float tamLados) {
        super(numLados, tamLados);
    }

    @Override
    float calculaArea() {
        float area = (getTamLados() * getTamLados()) / 2;
        return area;
    }
}
