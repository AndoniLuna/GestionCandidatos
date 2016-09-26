package com.ipartek.formacion.validator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void testIsValidDni() {

		assertTrue(Utilidades.isValidDni("11111111H"));
		assertTrue(Utilidades.isValidDni("11111111h"));

		assertTrue(Utilidades.isValidDni("72317021F"));
		assertFalse(Utilidades.isValidDni("72317021A"));
		assertFalse(Utilidades.isValidDni("72317021G"));

		assertFalse("No se controla la letra", Utilidades.isValidDni("11111111A"));

		assertFalse(Utilidades.isValidDni(null));
		assertFalse(Utilidades.isValidDni("11111111-H"));
		assertFalse(Utilidades.isValidDni("11111111 H"));
		assertFalse(Utilidades.isValidDni("111H"));
		assertFalse(Utilidades.isValidDni("11111111"));
	}

}
