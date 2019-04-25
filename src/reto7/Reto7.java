package reto7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Reto7 {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        String letra = "";
        int nivel = 0; 
        String palabra; 
        String palabraX;
        
        try{
        System.err.println("Indique el nivel: ");
        nivel = Integer.parseInt(entrada.readLine());
        palabra = getPalabraAleatoria(nivel);
        }catch(IOException e){
            System.out.println("Error.");
        }
        
        do{
            try{
                
                System.out.println("Indique una letra: ");
                letra = entrada.readLine();
        }catch(IOException e){
            System.out.println("Error, vuelva a intentarlo.");
        }
           try{
                System.out.println("Indique una letra: ");
                letra = entrada.readLine();
        }catch(IOException e){
            System.out.println("Error, vuelva a intentarlo.");
        } 
            
        }while(letra.equals('0'));
    }
        public static String getPalabraAleatoria(int nivel){
            String palabra = "";
            switch(nivel){
            case 1: 
                palabra = "gato";
                break;
            case 2:
                palabra = "positivo";
                break;
            case 3:
                palabra = "bachilerato";
                break;
                        
        }
            return palabra;
            
        }
    }
    

