package old;
class Carro {
    boolean motor;
    boolean embreagem;
    boolean caixaMarchas;
    boolean rodasPneus;
    boolean freios;
    boolean suspensao;
    boolean fluidos;
    boolean teveProblema;

    public void setCaixaMarchas(boolean caixaMarchas) {
        this.caixaMarchas = caixaMarchas;
    }
    public void setEmbreagem(boolean embreagem) {
        this.embreagem = embreagem;
    }
    public void setFluidos(boolean fluidos) {
        this.fluidos = fluidos;
    }
    public void setFreios(boolean freios) {
        this.freios = freios;
    }
    public void setMotor(boolean motor) {
        this.motor = motor;
    }
    public void setRodasPneus(boolean rodasPneus) {
        this.rodasPneus = rodasPneus;
    }
    public void setSuspensao(boolean suspensao) {
        this.suspensao = suspensao;
    }

    public Carro() {

    }

    public Carro(boolean motor, boolean embreagem, boolean caixaMarchas, boolean rodasPneus, boolean freios, boolean suspensao, boolean fluidos) {
        this.motor = motor;
        this.embreagem = embreagem;
        this.caixaMarchas = caixaMarchas;
        this.rodasPneus = rodasPneus;
        this.freios = freios;
        this.suspensao = suspensao;
        this.fluidos = fluidos;
    }
}