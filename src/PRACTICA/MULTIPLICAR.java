package PRACTICA;

public class MULTIPLICAR {
	

	public static void main(String[] args) {
	int[] prodArray = {6, 8, 20, 23, 12};
    int producto = 1; // Inicializamos el producto en 1 (no 0, ya que cualquier número multiplicado por 0 es 0)

    // Recorremos el arreglo y multiplicamos los valores
    for (int i = 0; i < prodArray.length; i++) {
        producto *= prodArray[i]; // Multiplicamos el valor actual
    }

    // Imprimimos el resultado
    System.out.println("El producto de los elementos del arreglo es: " + producto);
    
	}
}
