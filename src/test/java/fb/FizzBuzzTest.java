package fb;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz jogo;

	@Before
	public void setUp() {
		this.jogo = new FizzBuzz();
	}

	@Test
	public void deveRetornarBuzzQuandoMultiploDe7() {
		String resposta = jogo.jogo(7);

		Assert.assertEquals("buzz", resposta);
	}

	@Test
	public void deveRetornarFizzBuzzQuandoMultiploDe5e7() {
		String resposta = jogo.jogo(35);

		Assert.assertEquals("fizzbuzz", resposta);
	}

	@Test
	public void deveRetornarOProprioNumeroQuandoMultiploDeNenhumDeles() {
		String resposta = jogo.jogo(13);

		Assert.assertEquals("13", resposta);
	}

	@Test
	public void bluesoft() {

		String resposta = jogo.jogo(700);

		Assert.assertEquals("bluesoft", resposta);
	}

}
