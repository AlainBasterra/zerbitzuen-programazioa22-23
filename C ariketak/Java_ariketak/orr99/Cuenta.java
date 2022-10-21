class Cuenta {
    private int saldo;

    Cuenta (int s) {saldo = s;}
    int getSaldo() {return saldo;}
    void restart (int cantidad){
        saldo = saldo - cantidad;
    }

    void RetirarDinero(int cant, String nom){
        if(getSaldo() >= cant){
            System.out.println("SE VA A RETIRAR SALDO ( ACTUAL ES: " + getSaldo() + ")");
            try{
                Thread.sleep(500);
            } catch (InterruptedException ex) {}
            restart(cant);
            System.out.println(nom + " retira => " + cant + " ACTUAL (" + getSaldo() +")" );
        } else {
        System.out.println(nom+" No puede retirar dinero, NO HAY SALDO ("+getSaldo()+")" );
        }
        if (getSaldo() < 0) {
        System.out.println("SALDO NEGATIVO => " + getSaldo());
        }
    }//Retira
}


    public class CompartirInf3 {
        public static void main(String[] args) {
        Cuenta c = new Cuenta(40);
        SacarDinero h1 = new SacarDinero("Ana", c);
        SacarDinero h2 = new SacarDinero("Juan", c);
        h1.start ();
        h2.start ();
        }
        }