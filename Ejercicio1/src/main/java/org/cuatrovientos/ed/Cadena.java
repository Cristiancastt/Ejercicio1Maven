package org.cuatrovientos.ed;

public class Cadena {
	public int longitud(String cadena) {
		return cadena.length();
	}

	public int vocales(String cadena) {
		int count = 0;
		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		return count;
	}

	public String invertir(String cadena) {
		StringBuilder sb = new StringBuilder(cadena);
		return sb.reverse().toString();
	}

	public int contarLetra(String cadena, char caracter) {
		int count = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				count++;
			}
		}
		return count;
	}
}