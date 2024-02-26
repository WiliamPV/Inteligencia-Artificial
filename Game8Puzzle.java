package IA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class Game8Puzzle {
	
	static Nodo vFinal = new Nodo("123456780");
	
	public static void main(String[] args) {
		Nodo inicial = new Nodo ("123046758");
		
		System.out.println("Valor Incial: "+inicial.getValor());
		Nodo respuesta = busquedaPorAnchura(inicial);
		System.out.println("Valor Final: "+respuesta.getValor());
	}
	
	public static Nodo busquedaPorAnchura (Nodo inicial) {
		if(inicial.getValor().equals(vFinal.getValor()))
			return inicial;	
		
		ArrayList<Nodo> Visitados = new ArrayList<>();
		Queue <Nodo> cola = new LinkedList<>();
		cola.add(inicial);
		
		while(!cola.isEmpty()) {
			Nodo n = cola.poll();
			
			if(n.getValor().equals(vFinal.getValor())) {
				return n;
			}
			ArrayList<Nodo> hijos = new ArrayList<>();
			hijos = buscarHijos(n);
			
            for (Nodo hijo : hijos) {
            	
            	boolean exit = false;
            	
            	for(Nodo visitado : Visitados) {
            		if(visitado.getValor().equals(hijo.getValor()))
            			exit = true;
            	}
            	
                if(!exit)
                {
                	System.out.println(hijo.getValor());
                	cola.add(hijo);
                	Visitados.add(hijo);
                }
            }
			
		}
		return inicial;
	}
	
	public static ArrayList<Nodo> buscarHijos(Nodo n){
		ArrayList<Nodo> hijos = new ArrayList<>();
		String nod = n.getValor();
		
		int posicion = nod.indexOf("0");
		
		if(posicion == 0) {
			char hijo1 = nod.charAt(1);
			char hijo2 = nod.charAt(3);
			
	        char[] car1= nod.toCharArray();
	        car1[0] = hijo1;
	        car1[1] ='0';
	        
	        char[] car2= nod.toCharArray();
	        car2[0] = hijo2;
	        car2[3] = '0';
	        
	        hijos.add(new Nodo(String.valueOf(car1)));
	        hijos.add(new Nodo(String.valueOf(car2)));
		}
		if(posicion == 1) {
			char hijo1 = nod.charAt(0);
			char hijo2 = nod.charAt(2);
			char hijo3 = nod.charAt(4);
			
	        char[] car1= nod.toCharArray();
	        car1[1] = hijo1;
	        car1[0] ='0';
	        
	        char[] car2= nod.toCharArray();
	        car2[1] = hijo2;
	        car2[2] = '0';
	        
	        char[] car3= nod.toCharArray();
	        car3[1] = hijo3;
	        car3[4] = '0';
	        
	        hijos.add(new Nodo(String.valueOf(car1)));
	        hijos.add(new Nodo(String.valueOf(car2)));
	        hijos.add(new Nodo(String.valueOf(car3)));
		}
		if(posicion == 2) {
			char hijo1 = nod.charAt(1);
			char hijo2 = nod.charAt(5);
			
	        char[] car1= nod.toCharArray();
	        car1[2] = hijo1;
	        car1[1] ='0';
	        
	        char[] car2= nod.toCharArray();
	        car2[2] = hijo2;
	        car2[5] = '0';
	        
	        hijos.add(new Nodo(String.valueOf(car1)));
	        hijos.add(new Nodo(String.valueOf(car2)));
		}
		if(posicion == 3) {
			char hijo1 = nod.charAt(0);
			char hijo2 = nod.charAt(4);
			char hijo3 = nod.charAt(6);
			
	        char[] car1= nod.toCharArray();
	        car1[3] = hijo1;
	        car1[0] ='0';
	        
	        char[] car2= nod.toCharArray();
	        car2[3] = hijo2;
	        car2[4] = '0';
	        
	        char[] car3= nod.toCharArray();
	        car3[3] = hijo3;
	        car3[6] = '0';
	        
	        hijos.add(new Nodo(String.valueOf(car1)));
	        hijos.add(new Nodo(String.valueOf(car2)));
	        hijos.add(new Nodo(String.valueOf(car3)));
		}
		if(posicion == 4) {
			char hijo1 = nod.charAt(1);
			char hijo2 = nod.charAt(3);
			char hijo3 = nod.charAt(5);
			char hijo4 = nod.charAt(7);
			
	        char[] car1= nod.toCharArray();
	        car1[4] = hijo1;
	        car1[1] ='0';
	        
	        char[] car2= nod.toCharArray();
	        car2[4] = hijo2;
	        car2[3] = '0';
	        
	        char[] car3= nod.toCharArray();
	        car3[4] = hijo3;
	        car3[5] = '0';
	        
	        char[] car4= nod.toCharArray();
	        car4[4] = hijo4;
	        car4[7] = '0';
	        
	        hijos.add(new Nodo(String.valueOf(car1)));
	        hijos.add(new Nodo(String.valueOf(car2)));
	        hijos.add(new Nodo(String.valueOf(car3)));
	        hijos.add(new Nodo(String.valueOf(car4)));
		}
		if(posicion == 5) {
			char hijo1 = nod.charAt(2);
			char hijo2 = nod.charAt(4);
			char hijo3 = nod.charAt(8);
			
	        char[] car1= nod.toCharArray();
	        car1[5] = hijo1;
	        car1[2] ='0';
	        
	        char[] car2= nod.toCharArray();
	        car2[5] = hijo2;
	        car2[4] = '0';
	        
	        char[] car3= nod.toCharArray();
	        car3[5] = hijo3;
	        car3[8] = '0';
	        
	        hijos.add(new Nodo(String.valueOf(car1)));
	        hijos.add(new Nodo(String.valueOf(car2)));
	        hijos.add(new Nodo(String.valueOf(car3)));
		}
		if(posicion == 6) {
			char hijo1 = nod.charAt(3);
			char hijo2 = nod.charAt(7);
			
	        char[] car1= nod.toCharArray();
	        car1[6] = hijo1;
	        car1[3] ='0';
	        
	        char[] car2= nod.toCharArray();
	        car2[6] = hijo2;
	        car2[7] = '0';
	        
	        hijos.add(new Nodo(String.valueOf(car1)));
	        hijos.add(new Nodo(String.valueOf(car2)));
		}
		if(posicion == 7) {
			char hijo1 = nod.charAt(4);
			char hijo2 = nod.charAt(6);
			char hijo3 = nod.charAt(8);
			
	        char[] car1= nod.toCharArray();
	        car1[7] = hijo1;
	        car1[4] ='0';
	        
	        char[] car2= nod.toCharArray();
	        car2[7] = hijo2;
	        car2[6] = '0';
	        
	        char[] car3= nod.toCharArray();
	        car3[7] = hijo3;
	        car3[8] = '0';
	        
	        hijos.add(new Nodo(String.valueOf(car1)));
	        hijos.add(new Nodo(String.valueOf(car2)));
	        hijos.add(new Nodo(String.valueOf(car3)));
		}
		if(posicion == 8) {
			char hijo1 = nod.charAt(5);
			char hijo2 = nod.charAt(7);
			
	        char[] car1= nod.toCharArray();
	        car1[8] = hijo1;
	        car1[5] ='0';
	        
	        char[] car2= nod.toCharArray();
	        car2[8] = hijo2;
	        car2[7] = '0';
	        
	        hijos.add(new Nodo(String.valueOf(car1)));
	        hijos.add(new Nodo(String.valueOf(car2)));
		}
		return hijos;
	}
	
}
