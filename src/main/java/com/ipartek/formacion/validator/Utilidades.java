package com.ipartek.formacion.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidades {

	public static boolean isValidDni(String dni) {
		boolean resul = false;
		Pattern mask = Pattern.compile("[0-9]{8}[A-Za-z]");
		final String LETRAS_CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE";
		if (dni != null) {
			Matcher matcher = mask.matcher(dni);
			if (matcher.matches()) {
				// comprobar letra de control
				int numeros = Integer.valueOf(dni.substring(0, 8));
				String letra = dni.substring(8, 9).toUpperCase();
				int resto = numeros % 23;
				char letraControl = LETRAS_CONTROL.charAt(resto);
				if (letra.equals(String.valueOf(letraControl))) {
					resul = true;
				}
			}
		}
		return resul;
	}

}
