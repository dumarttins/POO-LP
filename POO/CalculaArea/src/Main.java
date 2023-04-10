public class Main {
    public static void main(String[] args) {
        Triangulo tri = new Triangulo(3,4);
        Quadrado qua = new Quadrado(4, 4);

        System.out.println(tri.calculaArea()+"m²");
        System.out.println(qua.calculaArea()+"m²");
    }
}
