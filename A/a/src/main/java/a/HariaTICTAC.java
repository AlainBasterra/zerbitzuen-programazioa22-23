package a;

public class HariaTICTAC extends Thread {

    String mezua = "";

    public HariaTICTAC(int i) {
        if (i == 1)
            mezua = "TIC";
        else
            mezua = "TAC";
        setName(mezua);

    }

    @Override
    public void run() {
        while (true) {
            System.out.println(mezua);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
