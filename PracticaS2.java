
package practicas2;

import java.util.Scanner;
import java.util.Random;

public class PracticaS2 {
    static Scanner teclado=new Scanner(System.in);
    
    public static void main(String[] args) {
            int opcion;
        System.out.println("------MENU-------");
        System.out.println("1.Iniciar Sistema");
        System.out.println("2.Salir");
        System.out.println("-----------------");
        
        opcion=teclado.nextInt();
        
             switch (opcion){
               case 1:
           {
                  Estadistica ();
               
           }
                   break;
                   
               case 2:
                  System.out.println("¡Adios!");
                   System.exit(opcion);
                   break;
             }

    }
    
    static void Aritmetica (){
        int opcion ;
        System.out.println("Elige la operacion que deseas efectuar");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        
        opcion=teclado.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Ingresa los numeros que quieres sumar, presiona la tecla = para saber el resultado");
                String igual=null;
                
               igual=teclado.nextLine ();
                while(igual != "="){
                    igual=igual+igual;
                igual=teclado.nextLine (); 
                }
                System.out.println(igual);
                
        }
    }
    
    static void Geometrica (){
       int figura, opcion;
        System.out.println("Elige la operacion que deseas efectuar");
        System.out.println("1.Triangulo");
        System.out.println("2.Cuadrado");
        System.out.println("3.Circulo");
        System.out.println("4.Rectangulo");
        
        figura=teclado.nextInt();
        
        switch(figura){
            case 1:
        System.out.println("Elige la operacion que deseas efectuar");
        System.out.println("1.Area");
        System.out.println("2.Perimetro");
        
        opcion=teclado.nextInt();
        double b,h,a,l1,l2,l3,p;
        if(opcion==1){    //Inicio de operacion del area
            System.out.println("Ingrese la base");
                b=teclado.nextDouble();
            
            System.out.println("Ingrese la altura");
                h=teclado.nextDouble();
                a=(b*h)/2;
                
            System.out.println("El area es "+a);
                
 }
        if(opcion==2){    //Inicio de operacion del perimetro
            System.out.println("Ingrese lado 1");
                l1=teclado.nextDouble();
                
             System.out.println("Ingrese lado 2");
                l2=teclado.nextDouble();
                
            System.out.println("Ingrese lado 3");
                l3=teclado.nextDouble();
            
                p=l1+l2+l3;
            System.out.println("El perimetro es "+p);
                
 }
                break;
            case 2:
                System.out.println("Elige la operacion que deseas efectuar");
        System.out.println("1.Area");
        System.out.println("2.Perimetro");
        
        opcion=teclado.nextInt();
        
        if(opcion==1){    //Inicio de operacion del area
            System.out.println("Ingrese la base");
                b=teclado.nextDouble();
                a=(b*b);
                
            System.out.println("El area es "+a);
                
 }
        if(opcion==2){    //Inicio de operacion del perimetro
            System.out.println("Ingrese la base");
                b=teclado.nextDouble();
                
                p=4*b;
            System.out.println("El perimetro es "+p);
                
 }
                break;
                
             case 3:
        System.out.println("Elige la operacion que deseas efectuar");
        System.out.println("1.Area");
        System.out.println("2.Perimetro");
        
        opcion=teclado.nextInt();
        
        if(opcion==1){    //Inicio de operacion del area
            System.out.println("Ingrese la base");
                b=teclado.nextDouble();
                
                System.out.println("Ingrese la altura");
                h=teclado.nextDouble();
                a=(b*h);
                
            System.out.println("El area es "+a);
                
 }
        if(opcion==2){    //Inicio de operacion del perimetro
            System.out.println("Ingrese la base");
                b=teclado.nextDouble();
                
            System.out.println("Ingrese la altura");
                h=teclado.nextDouble();
                
                p=(2*b)+(2*h);
            System.out.println("El perimetro es "+p);
                
 }
                break;
                
             case 4:
                 System.out.println("Elige la operacion que deseas efectuar");
        System.out.println("1.Area");
        System.out.println("2.Perimetro");
        
        opcion=teclado.nextInt();
        double r;
        if(opcion==1){    //Inicio de operacion del area
            System.out.println("Ingrese el radio");
                r=teclado.nextDouble();
                a=(r*r*3.1416);
                
            System.out.println("El area es "+a);
                
 }
        if(opcion==2){    //Inicio de operacion del perimetro
            System.out.println("Ingrese el radio");
            r=teclado.nextDouble();
            p=r*r*2*3.1416;
            System.out.println("El perimetro es "+p);
        }
             
    }
        
    }
    
    static void Estadistica (){
        Random al=new Random();
        int n;
        int lista[]=new int[50];
        do{
            System.out.println("Ingrese un numero entero menor a 50");
                n=teclado.nextInt();
        }while(n<=50);
        
        for(int i=0;i<n;i++){
            lista[i]=al.nextInt();
        }
            
        for(int i=0; i<n;i++){
            System.out.print(lista [i]+"  ");
            
        } 
    }
   
    static void Matrices(){
        int op, forma;
        int m2 [][]=new int [2][2];
        int m3[][]=new int [3][3];
        
        System.out.println("Elige el tamaño de la matriz");
        System.out.println("1.  2X2");
        System.out.println("1.  3X3");
        System.out.println("----------------------------");
            op=teclado.nextInt();
            
        
        if(op==1){
            System.out.println("Deseas ingresar los datos de forma manual o automatica?");
            System.out.println("1. Manual");
            System.out.println("2. Automatica");
            System.out.println("-------------------------------------------------------");
                forma=teclado.nextInt();
                
                if(forma==1){
                    for (int i=0; i<2; i++){
                        for (int j=0; j<2; j++){
                            m2[i][j]=teclado.nextInt();
                        }
                    }     
                }
                
                if(forma==2){
                    for (int i=0; i<2; i++){
                        for (int j=0; j<2; j++){
                            Random matriz=new Random();
                            m2[i][j]=matriz.nextInt(100);
                        }
                    }
                    
                    for(int i=0; i<2;i++){
                        for(int j=0;j<2;j++){
                            System.out.print(m2[i][j]+"   ");
                        }
                        System.out.println("");
                    }
                }
        }
        
    }
    
    static void Avanzadas(){
         int aux=1;
        
        int n, op, f1,f2;
        System.out.println("Ingres un numero del 1-100");
        n=teclado.nextInt();
        
        
        System.out.println("--------------------");
        System.out.println("Que deseas calcular?");
        System.out.println("1. Factorial N");
        System.out.println("2. Fibonacci");
        System.out.println("--------------------");
        op=teclado.nextInt();
        
        if(op==1){
            for(int i=2;i<=n;i++){
                if(i==2){
                aux=i*(i-1)*aux; 
                }
                if(i>2){
                aux=(aux*(i));
                }
                 
            }
           System.out.println(n+"! = "+aux);
        }
        
        if(op==2){
        f1=0;
        f2=1;

        System.out.print(f1 + " ");
        for(int i=2;i<=n;i++){
            System.out.print(f2 + " ");
            f2 = f1 + f2; 
            f1 = f2 - f1; 
        }
        System.out.println();
        }
    }
}
