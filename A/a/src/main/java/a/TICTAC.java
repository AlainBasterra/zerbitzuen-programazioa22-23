package a;

public class TICTAC {
    public static void main(String[] args) {
        HariaTICTAC hTIC = new HariaTICTAC(1);
        HariaTICTAC hTAC = new HariaTICTAC(0);

        hTIC.start();
        hTAC.start();

        try {
            hTIC.join();
            hTAC.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
