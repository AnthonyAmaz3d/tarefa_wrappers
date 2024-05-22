/**
 * @author Anthony.Amaz3d
 */

public class Complexo {
    int numero;

    public Complexo(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Integer transformaWrappers(){
        Integer numero = this.getNumero();
        return numero;
    }

    public void imprimeNumero(){
        System.out.println(transformaWrappers());
    }

    public void imprimeClasse(){
        System.out.println(transformaWrappers().getClass());
    }
}