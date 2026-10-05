public class CuentaBancaria {

    private String nombreTitular;
    private double saldoActual;
    private int numeroCuenta;

    public CuentaBancaria(String nombreTitular, double saldoActual, int numeroCuenta){

    this.nombreTitular = nombreTitular;
    this.saldoActual = saldoActual;
    this.numeroCuenta = numeroCuenta;

    }

    private double getSaldoActual() {
        return saldoActual;
    }

    private int getNumeroCuenta() {
        return numeroCuenta;
    }

    private String getNombreTitular() {
        return nombreTitular;
    }

    void mostrarDatos(){

        System.out.print("==================================");
        System.out.println("\ntitular: " + this.nombreTitular);
        System.out.println("numero de cuenta: " + this.numeroCuenta);
        System.out.println("Saldo disponible:" + this.saldoActual);
        System.out.print("==================================");

    }

    public void agregarSaldo(double monto){

        if(monto <= 0){

          System.out.println("ingrese una cantidad positiva");

        }
        else{

            saldoActual += monto;

            System.out.println("Se agrego " + monto + " a la cuenta");

        }

    }

    public boolean retirarSaldo(double monto) {

        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor a cero.");
            return false;
        }

        if (monto > saldoActual) {
            System.out.println("Saldo insuficiente para retirar " + monto);
            return false;
        }

        saldoActual = saldoActual - monto;
        System.out.println("Retiro exitoso de " + monto + ". Saldo actual: " + saldoActual);
        return true;
    }

    }

