package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
//Autor Johann Escobar Pastrana
public class RPCClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));   ////IGUAL SALDRA ERROR Y LE DAS AL PRIMERO
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        ///////////ACCESO AL server TODO LO DE ARRIBA///////

        Scanner leer = new Scanner(System.in);

        Object [] data = {3.6,10D}; ////si le ponemos la D lo hace double el valor
        Double response = (Double) client.execute("Methods.addition", data);
        System.out.println("Result>>>>>>> "+ response);


        System.out.println("Calcular tu IMC");
        System.out.println("Dame tu nombre");
        String nombre ;
        nombre = leer.nextLine();

        System.out.println("Dame tu peso");
        double peso;
        peso = leer.nextDouble();

        System.out.println("Dame tu altura");
        double altura;
        altura = leer.nextDouble();

        Object [] dato = {nombre,peso,altura};
        Double respuesta = (Double) client.execute("Methods.IMC", dato);
        System.out.println("Hola "+dato[0] +" Tu IMC es de "+ respuesta);


        ///////////////ACTIVIDAD 2////////////////

        System.out.println("Nombre producto 1");
        String nombre1;
        nombre1 = leer.nextLine();
        System.out.println("Nombre producto 2");
        String Nombre2;
        Nombre2 = leer.nextLine();
        System.out.println("Nombre producto 3");
        String Nombre3;
        Nombre3 = leer.nextLine();
        System.out.println("Nombre producto 4");
        String Nombre4;
        Nombre4 = leer.nextLine();

        System.out.println("Precio Producto");
        System.out.println("Valor 1");
        double num1 ;
        num1 = leer.nextDouble();

        System.out.println("Precio Producto");
        System.out.println("Valor 2");
        double num2 ;
        num2 = leer.nextDouble();

        System.out.println("Precio Producto");
        System.out.println("Valor 3");
        double num3 ;
        num3 = leer.nextDouble();

        System.out.println("Precio Producto");
        System.out.println("Valor 4");
        double num4 ;
        num4 = leer.nextDouble();


        Object [] datos = {nombre1,num1,num2,num3,num4};
        Double respuestas = (Double) client.execute("Methods.productoSuma", datos);
        Double respuestas2 = (Double) client.execute("Methods.productoPromedio", datos);

        System.out.println("Hola el Producto es: "+datos[0] +"la Suma es: "+ respuestas +"y el promedio es: "+ respuestas2);

///////////////ACTIVIDAD 3////////////////


        System.out.println("Valor 1");
        int numer1 ;
        numer1 = leer.nextInt();

        System.out.println("Valor 2");
        int numer2 ;
        numer2 = leer.nextInt();

        Object [] datos3 = {numer1,numer2};
        int respuestas3_1 = (int) client.execute("Methods.Rango", datos3);
        int respuestas3 = (int) client.execute("Methods.sumaRango", datos3);

        System.out.print(respuestas3_1 + "\n");
        System.out.printf("Sumatoria de los Numeros: "+respuestas3);

        ///////////////ACTIVIDAD 4////////////////


        System.out.println("Valor 1");
        double nume1 ;
        nume1 = leer.nextDouble();

        System.out.println("Valor 2");
        double nume2 ;
        nume2 = leer.nextDouble();

        System.out.println("Valor 3");
        double nume3 ;
        nume3 = leer.nextDouble();

        System.out.println("Valor 4");
        double nume4 ;
        nume4 = leer.nextDouble();

        Object [] datos4 = {nume1,nume2,nume3,nume4};
        Double respuestas4 = (Double) client.execute("Methods.numIncremento", datos4);
        System.out.println("Orden Ascendente :"+respuestas4);

    }

}
