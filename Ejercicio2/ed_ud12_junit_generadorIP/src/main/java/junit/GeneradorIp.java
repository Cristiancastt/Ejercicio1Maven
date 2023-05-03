package junit;
import java.util.Random;
public class GeneradorIp {
    private Random random = new Random();
    public int generarNumero(int min, int max) {
        return random.nextInt(max - min) + min;
    }
    public String generarIp() {
        String ip = "";
        for (int i = 0; i < 4; i++) {
            int numero = generarNumero(1, 255);
            ip += String.valueOf(numero);
            if (i < 3) {
                ip += ".";
            }
        }
        return ip;
    }
	public GeneradorIp() {
		super();
	}
    
}