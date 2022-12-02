import java.io.*;
import java.net.*;

public class Erabiltzailea {
    public static void main(String[] args) throws Exception {
        String Host = "192.168.65.16";
        int Puerto = 6000;// puerto remoto
        System.out.println("PROGRAMA CLIENTE INICIADO....");
        Socket Cliente = new Socket(Host, Puerto);
        // CREO FLUJO DE SALIDA AL SERVIDOR
        DataOutputStream flujoSalida = new DataOutputStream(Cliente.getOutputStream());
        // ENVIO UN SALUDO AL SERVIDOR
        flujoSalida.writeUTF("AAAAAAAAA");
        // CREO FLUJO DE ENTRADA AL SERVIDOR
        DataInputStream flujoEntrada = new DataInputStream(Cliente.getInputStream());
        // EL SERVIDOR ME ENVIA UN MENSAJE
        System.out.println("Recibiendo del SERVIDOR: \n\t" +
                flujoEntrada.readUTF());
        // CERRAR STREAMS Y SOCKETS
        flujoEntrada.close();
        flujoSalida.close();
        Cliente.close();
    }// main
}
