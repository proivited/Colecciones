import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * La coleccion set no puede contener elementos duplicados
		 * solo tiene los metodos heredados de collection
		 * existen diferentes toipo de implementos
		 * 
		 * HashSet esta: esta implementacion alkmacena los elemntso en una tabla 
		 * hash. es la mejor rendimiento tiene.
		 * Los elementos no tieenen un orden
		 */
		/**codigo desordenado
		 * Set<String> frutas = new HashSet();
		frutas.add("Manzana");
		frutas.add("Mango");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Maracuya");
		frutas.add("Platano");
		frutas.add("Carambola");
		frutas.add("Mandarina");
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		 */
		
		/**\ los acomoda en orden alfabetico
		 * Set<String> frutas = new TreeSet();
		frutas.add("Manzana");
		frutas.add("Mango");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Maracuya");
		frutas.add("Platano");
		frutas.add("Carambola");
		frutas.add("Mandarina");
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		 */
		//ordena por orden de ingreso
		
		Set<String> frutas = new LinkedHashSet();
		frutas.add("Manzana");
		frutas.add("Mango");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Maracuya");
		frutas.add("Platano");
		frutas.add("Carambola");
		frutas.add("Mandarina");
		
		for(String fruta: frutas) {
			System.out.println(fruta);
		}
		
		System.out.println(frutas.size());
		
		/**
		 * La interfaz List define una sucesion de elementos.
		 * Si admite elemntos duplicados.
		 * Anade nuevos metodos que podemos usar
		 * Acceso posicional a elemtnso:
		 */
		
	}

}
