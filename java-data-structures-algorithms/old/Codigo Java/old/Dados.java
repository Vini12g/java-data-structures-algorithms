package old;
public class Dados {
    private static int proximoIndice = 1;
    private int indice;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double distancia;

    public Dados(int x1, int y1, int x2, int y2) {
        this.indice = proximoIndice++;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        calcularDistancia();
    }

    private void calcularDistancia() {
        // Calcula a distância euclidiana entre os pontos (x1, y1) e (x2, y2)
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        this.distancia = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public String toString() {
        return String.format("%d\t%d\t%d\t%d\t%d\t%.2f", indice, x1, y1, x2, y2, distancia);
    }
}
