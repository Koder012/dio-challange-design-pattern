package dio.challenge.prototype.shapes;

import java.util.Objects;

public abstract class Shape {

    public int y;
    public int x;
    public String cor;

    public Shape(){

    }
    public Shape(Shape forma){
        if(forma != null){
            this.y = forma.y;
            this.x = forma.x;
            this.cor = forma.cor;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object){
        if(!(object instanceof Shape)) return false;
            Shape forma = (Shape) object;
        return forma.x == x && forma.y == y && Objects.equals(forma.cor, cor);
    }
}
