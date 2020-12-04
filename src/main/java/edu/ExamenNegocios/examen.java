package edu.ExamenNegocios;

import com.sun.net.httpserver.HttpsServer;

import javax.xml.ws.http.HTTPException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class examen {
    public static void main(String[] args){

        try{

            HttpsServer server = HttpsServer.create(new InetSocketAddress(4001),0);
            server.createContext("/", (httpExchange)->{
                String res = "YMCMB";
                httpExchange.sendResponseHeaders(200, res.length());
                OutputStream os = httpExchange.getResponseBody();
                os.write(res.getBytes());
                os.close();
            });
            System.out.println("Servidor Iniciado");
            server.start();

        }catch (IOException e){
            e.printStackTrace();
        }



    }

}
