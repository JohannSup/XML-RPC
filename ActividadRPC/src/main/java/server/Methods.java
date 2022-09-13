package server;

import java.util.Arrays;

//Autor Johann Escobar Pastrana
public class Methods {

    public double addition(double num1,double num2){ ///METODO SUMAAAAAAAAAA
        return num1+num2;
    }





    public double IMC (String nombre, double peso,double altura){
        double val = peso/(altura * altura);

        return val;
    }

    public double productoSuma(String nombre1,double num1,double num2,double num3,double num4){
        double respuestas;
        respuestas = (num1+num2+num3+num4);

        return respuestas;
    }

    public double productoPromedio(String nombre1,double num1,double num2,double num3,double num4){
        double respuestas;
        respuestas = (num1+num2+num3+num4)/4;

        return respuestas;
    }

    public Double[] numIncremento(double num1, double num2, double num3, double num4){
        Double [] numeros = { num1,num2,num3,num4};
        Arrays.sort(numeros);

        return numeros;
    }



    public static int sumaRango(int numer1, int numer2) {
        int minimo = Math.min(numer1, numer2);
        int maximo = Math.max(numer1, numer2);
        int suma = 0;

        for (int i = minimo; i <= maximo; i++) {
            suma += i;
        }
        return suma;
    }


    public static int Rango(int numer1, int numer2) {
        if (numer1 < numer2) {
            for (int i = numer1; i <= numer2; i++) {
                return i;
            }
        } else {
            for (int i = numer2; i <= numer1; i++) {
                return i;
            }
        }
        return numer1;
    }


}
