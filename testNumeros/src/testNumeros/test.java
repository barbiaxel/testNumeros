package testNumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test{
	int num1,num2;
	public void leeNumeros(){
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader buff = new BufferedReader(isr);
	try{
		System.out.print("Introduzca el primer número:");
		String ln = buff.readLine();
		num1=Integer.parseInt(ln);
		System.out.print("Introduzca el segundo número:");
		ln = buff.readLine();
		num2=Integer.parseInt(ln);
	}catch(IOException e){
		System.err.println("Se ha producido una IOException");
		e.printStackTrace();
	}catch (Throwable e) {
		System.err.println("Error de programa: " + e);
		e.printStackTrace();
	}
}
	
public void muestraNumeros(){
	try{
		System.out.println(num1+num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
	} catch (ArithmeticException e) {
		System.out.println("División por cero");
	} catch (Exception e) {
		System.out.println("Se produjo un error en el programa");
	}
}

public static void main(String[] args) {
	test t = new test();
	t.leeNumeros();
	t.muestraNumeros();
	}
}