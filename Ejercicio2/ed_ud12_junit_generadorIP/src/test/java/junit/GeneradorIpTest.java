package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class GeneradorIpTest {

	GeneradorIp generador=new GeneradorIp();;


	@RepeatedTest(1000)
	public void testGenerarNumero() {
		int rangoMin = 0;
		int rangoMax = 254;
		for (int i = 0; i < 1000; i++) {
			int numero = generador.generarNumero(rangoMin, rangoMax);
			assertTrue(numero >= rangoMin && numero <= rangoMax, "El número generado debe estar dentro del rango");
		}
	}

	@RepeatedTest(1)
	public void testGenerarIp() {
		for (int i = 0; i < 1000; i++) {
			String ip = generador.generarIp();
			assertFalse(ip.startsWith("0"), "La IP no debe empezar con 0");
			assertTrue(ip.endsWith("0"), "La IP no debe terminar con 0");
		}
	}

}