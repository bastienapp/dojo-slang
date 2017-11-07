import junit.framework.*;
import org.junit.Test;

public class SlangTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		Slang slang = new Slang();
		assertEquals("sonmai", slang.convert("maison"));
	}

	@Test
	public void test2easy() throws Exception {
		Slang slang = new Slang();
		assertEquals("La sonmai près de la ainefont", slang.convert("La maison près de la fontaine"));
	}

	/*@Test
	public void test2hard() throws Exception {
		Slang slang = new Slang();
		assertEquals("La sonmai près de la tainefon", slang.convert("La maison près de la fontaine"));
	}*/
}
