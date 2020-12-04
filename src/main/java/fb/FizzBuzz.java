package fb;

public class FizzBuzz {

	public String jogo(int numero) {

		if (numero >= 500) {
			return "bluesoft";
		}

		if (((numero % 5) == 0) && ((numero % 7) == 0)) {
			return "fizzbuzz";
		}

		if (numero >= 500) {
			return "fizz";
		}

		if ((numero % 7) == 0) {
			return "buzz";
		}

		return String.valueOf(numero);
	}

}
