package ar.edu.unq.po2.tp3;

class Rectangulo{
    Punto origen;
    Float altura;
    Float base;

    Rectangulo(Float x, Float y, Float altura, Float base){
        setOrigen(x,y);
        this.altura = altura;
        this.base   = base;
    }

    void setOrigen(Float x, Float y){
        origen = new Punto(x,y);
    }

    Float area() { return altura * base; }

    Float perimetro() { return 2 * altura + 2 * base; }

    Boolean esHorizontal() { return altura < base; }

    Boolean esVertical() { return altura > base; }
}
