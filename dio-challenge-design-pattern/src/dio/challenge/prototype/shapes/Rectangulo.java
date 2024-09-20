package dio.challenge.prototype.shapes;

public class Rectangulo extends Shape{

    public int altura;
    public int largura;

    public Rectangulo(){
        super();
    }
    public Rectangulo(Rectangulo rectangulo){
        super(rectangulo);
        if(rectangulo != null){
            this.altura = rectangulo.altura;
            this.largura = rectangulo.largura;
        }
    }
    @Override
    public Shape clone() {
        return new Rectangulo(this);
    }

    @Override
    public boolean equals(Object object){
        if(!(object instanceof Rectangulo) || super.equals(object)) return false;
        Rectangulo rectangulo = (Rectangulo) object;
        return rectangulo.largura == largura && rectangulo.altura == altura;
    }
}
