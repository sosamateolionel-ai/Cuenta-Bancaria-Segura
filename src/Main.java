void main() {

    CuentaBancaria cuenta = new CuentaBancaria("Mateo Sosa",3000,1234567);

    cuenta.retirarSaldo(3400);
    cuenta.agregarSaldo(1000);
    cuenta.retirarSaldo(3400);

    cuenta.mostrarDatos();

}