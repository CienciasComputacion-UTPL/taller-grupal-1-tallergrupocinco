package ec.edu.utpl.poo.semana2;

public class Banco {
    private double saldo;
    public static int contCuenta;
    public Banco(){
        saldo=0;
        contCuenta++;
    }

    public Banco(double saldo){
        cantNegativo(saldo);
        this.saldo=saldo;
        contCuenta++;

    }
    public double getSaldo() {
        return saldo;
    }
    public double depositar(double introducir){
        cantDepo(introducir);
        setSaldo(saldo+introducir);
        return saldo;
    }
    public double retirar(double sacar){
        cantRango(saldo,sacar);
        setSaldo(saldo-sacar);
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    private void cantNegativo(double saldo){
        if(saldo<0){
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }
    }
    private void cantRango(double saldo, double retirar){
    if(retirar>saldo){
        throw new IllegalArgumentException("La cantidad usted solicita es mayor a su saldo");
    }
    if(retirar<0){
        throw new IllegalArgumentException("El valor a retirar tiene que ser positivo");
        }
    }
    private void cantDepo(double depositar){

        if(depositar<0){
            throw new IllegalArgumentException("El valor a depositat tiene que ser positivo");
        }
    }


}