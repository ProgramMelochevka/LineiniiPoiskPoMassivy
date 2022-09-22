package by.home.maxzzzit;

// Линейный поиск в массиве заданного элемента.
public class LineiniiPoiskPoMassivy {
	public static void main(String[]args) {
		int [] array = new int [] {34,65,87,34,2,6,87,34,6,87,345,7,8,23,15,17,54,23,76};
		int iskomii = 5;
		System.out.println(rezult (array, iskomii));
	}
	
	static int rezult (int [] massiv, int poisk) {
		for (int i = 0; i < massiv.length; i++) {
			if (massiv[i] == poisk) {
				System.out.println("Элемент "+massiv[i]+" найден на позиции - "+(i+1));
				return massiv[i];
			}
		}
		return -1;
	}
}
