package co.edu.uniquindio.poo.model;

public class Pedido {

    private String platoPrincipal;
    private String entrada;
    private String postre;
    private String bebida;
    private String observaciones;

    private Pedido(Builder b) {

        this.platoPrincipal = b.platoPrincipal;
        this.entrada = b.entrada;
        this.postre = b.postre;
        this.bebida = b.bebida;
        this.observaciones = b.observaciones;
    }

    public static class Builder {

        private String platoPrincipal;
        private String entrada;
        private String postre;
        private String bebida;
        private String observaciones;

        public Builder conPlatoPrincipal(String v) {
            this.platoPrincipal = v;
            return this;
        }

        public Builder conEntrada(String v) {
            this.entrada = v;
            return this;
        }

        public Builder conPostre(String v) {
            this.postre = v;
            return this;
        }

        public Builder conBebida(String v) {
            this.bebida = v;
            return this;
        }

        public Builder conObservaciones(String v){
            this.observaciones = v;
            return this;
        }

        public Pedido build() {

            if(platoPrincipal == null){
                throw new IllegalArgumentException("El plato principal es obligatorio");
            }

            return new Pedido(this);
        }
    }

    public String toString(){
        return "Pedido{" +
                "platoPrincipal='" + platoPrincipal + '\'' +
                ", entrada='" + entrada + '\'' +
                ", postre='" + postre + '\'' +
                ", bebida='" + bebida + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}