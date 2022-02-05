//package src;
package ejercicio;

import java.util.Scanner;

public class Persona {
    //variables
    private String nombre;
    private int edad, dni;
    private double peso, altura;
    //constante
    private final char sexo;
    
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String neim;
        int eda, pes;
        char sec;
        double alt;
        
        System.out.println("nombre");
        neim = entrada.next();
        
        System.out.println("edad");
        eda = entrada.nextInt();
        
        System.out.println("sexo");
        sec = entrada.next().charAt(0);
        
        System.out.println("peso");
        pes = entrada.nextInt();
        
        System.out.println("alt");
        alt = entrada.nextDouble();
        
        Persona p1 = new Persona(neim, eda, sec, pes, alt);
        System.out.println(p1.toString());
        System.out.println(p1.calcularIMC());
        
        Persona p2 = new Persona("Luz", 33, 'm', 123, 125);
        System.out.println(p2.calcularIMC());
        System.out.println(p2.toString());
        
        
        Persona p3 = new Persona(neim, eda, sec, alt, alt);
        Persona apunte1 = p3;
        apunte1.setNombre("Juan");
        apunte1.setEdad(25);
        apunte1.setPeso(145);
        apunte1.setAltura(156);
        System.out.println(p3.toString());
        
        
    }

    //constructor
    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
    }
    
    //metodos
    public double calcularIMC(){
        double imc;
        imc = (peso)/(altura*altura);
        if (imc < 20) {
            return -1;
        }
        
        else if (imc >= 20 && imc <= 25) {
            return 0;
        }
        
        else {
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(){
        if (edad > 17) {
            return true;
        }
        
        else{
            return false;
        }
    }
    
    public void comprobarSexo(char sexo){
        if (sexo == 'h') {
            System.out.println(sexo);
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", peso=" + peso + ", altura=" + altura + ", sexo=" + sexo + '}';
    }
    
    public long generaDNI(){
        int aleatorio;
        aleatorio = (int)(Math.random() * (10000000 + 99999999));
        dni = aleatorio;
        return dni;
    }
    
    public void generaDNIletra(){
        int valor;
        valor = dni % 23;
        
        switch(valor){
            case 0:
                System.out.println("T");
            case 1: 
                System.out.println("R");
            case 2:
                System.out.println("W");
            case 3:
                System.out.println("A");    
            case 4:
                System.out.println("G");  
            case 5:
                System.out.println("M");   
            case 6:
                System.out.println("Y");  
            case 7:
                System.out.println("F");   
            case 8:
                System.out.println("P");    
            case 9:
                System.out.println("D");   
            case 10:
                System.out.println("X");    
            case 11:
                System.out.println("B");    
            case 12:
                System.out.println("N");    
            case 13:
                System.out.println("J");   
            case 14:
                System.out.println("Z");  
            case 15:
                System.out.println("S");
            case 16:
                System.out.println("Q");    
            case 17:
                System.out.println("V"); 
            case 18:
                System.out.println("H"); 
            case 19:
                System.out.println("L");
            case 20:
                System.out.println("c");
            case 21:
                System.out.println("K"); 
            case 22:
                System.out.println("E");        
        }
    }
    
    //set get
    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    
}
