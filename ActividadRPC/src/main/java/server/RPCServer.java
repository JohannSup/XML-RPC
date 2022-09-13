package server;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;

import java.io.IOException;
//Autor Johann Escobar Pastrana
public class RPCServer {
    public static void main(String[] args) throws XmlRpcException, IOException {///// PSVM Y TABULADOR Y HACE ESTO
        System.out.println("Initialize server...");
        PropertyHandlerMapping mapping = new PropertyHandlerMapping();////POR MEDIO DE UNA PALABRA CLAVE SELECCIONARA LOS METODOS
        mapping.addHandler("Methods", Methods.class); //////SALDRA UN ERROR Y EN EL FOCO ROJO PONES XmlRpcException
        WebServer server = new WebServer(1200);
        server.getXmlRpcServer().setHandlerMapping(mapping);
        server.start();/////TAMBIEN SALDRA ERROR AQUI Y SELECCIONAS LO PRIMERO

        System.out.println("Server running in http://localhost:1200");
        System.out.println("Waiting request.../esperando peticiones");



    }

}
