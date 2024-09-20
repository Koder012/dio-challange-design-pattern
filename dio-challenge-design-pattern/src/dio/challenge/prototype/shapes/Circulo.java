package dio.challenge.prototype.shapes;

public class Circulo extends Shape{

    public int raio;

    public Circulo(){
        super();
    }
    public Circulo(Circulo circulo){
        super(circulo);
        if(circulo != null)
            this.raio = circulo.raio;
    }
    @Override
    public Shape clone() {
        return new Circulo(this);
    }

    public boolean equals(Object object){
        if(!(object instanceof  Circulo) || !super.equals(object)) return false;
        Circulo circulo = (Circulo) object;
        return circulo.raio == raio;
    }
}
