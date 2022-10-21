package a;

public class Ariketa_2_1 extends Thread {
    public void run() {
        if (this.getName().equals("h1")) {
            System.out.println("TIC");
        } else {
            System.out.println("TAC");
        }
    }

    public static void main(String[] args) {
        Ariketa_2_1 h1, h2;
        h1 = new Ariketa_2_1();
        h2 = new Ariketa_2_1();

        for (int i = 0; i < 100; i++) {
            h1.start();
            h2.start();
        }
    }// main
}// clase
