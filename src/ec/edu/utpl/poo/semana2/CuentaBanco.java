package ec.edu.utpl.poo.semana2;

public class CuentaBanco {
    public static void main(String[] args) {
        Banco b1 = new Banco(23.50);

        System.out.println("Saldo: "+b1.getSaldo());
        b1.depositar(10);
        System.out.println(b1.getSaldo());
        b1.retirar(7);
        System.out.println(b1.getSaldo());
        Banco b2= new Banco();
        System.out.println(b1.contCuenta);
    }
}
