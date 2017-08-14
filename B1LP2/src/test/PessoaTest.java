package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import aula2.Pessoa;
import junit.framework.Assert;

/* JUnit Test
 * The commented lines represent a error that cannot be fixed
 * Check them out in class
 */

public class PessoaTest {

	Pessoa p1;
	
	@Before
	public void setUp() throws Exception {
		p1 = new Pessoa("Edu", "12345678912",'M');
	}

	@Test
	public void testEqualsDifferentClasses() {
		String s = "abc";
		Assert.assertFalse(p1.equals(s));
		Assert.assertFalse(s.equals(p1));
	}
	
	@Test
	public void testEqualsDifferentName() {
		Pessoa p2 = new Pessoa("Jose", "12345678912",'M');
		Assert.assertFalse(p1.equals(p2));
		Assert.assertFalse(p2.equals(p1));
	}
	
	@Test
	public void testEqualsDifferentCpf() {
		Pessoa p2 = new Pessoa("Edu", "11111111111",'M');
		Assert.assertFalse(p1.equals(p2));
		Assert.assertFalse(p2.equals(p1));
	}
	
	@Test
	public void testEqualsDifferentSex() {
		Pessoa p2 = new Pessoa("Edu", "12345678912",'F');
		Assert.assertFalse(p1.equals(p2));
		Assert.assertFalse(p2.equals(p1));
	}
	
	@Test
	public void testEqualsPessoaNull() {
		Pessoa p2 = null;
		Assert.assertFalse(p1.equals(p2));
		//Assert.assertFalse(p2.equals(p1));
	}
	
	@Test
	public void testEqualsDuplicatedPessoa() {
		Pessoa p2 = p1;
		//Assert.assertFalse(p1.equals(p2));
		//Assert.assertFalse(p2.equals(p1));
	}
	
	@Test
	public void testCpfMoreThanElevenDigits() {
		Assert.assertFalse(Pessoa.checkCpf("54354385347853"));
	}
	
	@Test
	public void testCpfLessThanElevenDigits() {
		Assert.assertFalse(Pessoa.checkCpf("432423"));
	}
	
	@Test
	public void testCpfFirstDigitZero() {
		Assert.assertFalse(Pessoa.checkCpf("01111111111"));
	}
	
	@Test
	public void testCpfLetters() {
		Assert.assertFalse(Pessoa.checkCpf("789ff485843"));
	}
	
	@Test
	public void testSexOtherLetter() {
		Assert.assertFalse(Pessoa.checkSexo('U'));
	}
	
	@Test
	public void testSexLowerCase() {
		Assert.assertFalse(Pessoa.checkSexo('f'));
	}
	
	@Test
	public void testSexNumberCharacter() {
		Assert.assertFalse(Pessoa.checkSexo('1'));
	}
}
