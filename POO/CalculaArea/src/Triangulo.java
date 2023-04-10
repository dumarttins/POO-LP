public class Triangulo extends PoligonoRegular{
    public Triangulo(int numLados, float tamLados) {
        super(numLados, tamLados);
    }

    @Override
    float calculaArea() {
        float area = (getTamLados() * getTamLados()) / 2;
        return area;
    }
}
