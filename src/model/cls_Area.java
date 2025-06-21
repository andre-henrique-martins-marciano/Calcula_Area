
package model;

public class cls_Area {
    //calcular o quadrado
    public double calcularArea(double base,double altura){
    return(base*altura);
    }
    //calcular do triangulo
        public double calcularArea(double base,double altura, int valor){
    return(base*altura/valor);
    }
    // calcular area do circulo
    public double calcularArea(double raio){
       double pi=3.1416;
    return(pi*raio*raio);
    }
}
