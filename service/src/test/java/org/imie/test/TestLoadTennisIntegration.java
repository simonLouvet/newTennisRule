/**
 * 
 */
package org.imie.test;

import static org.junit.Assert.assertEquals;

import org.imie.Jeux;
import org.imie.Serialiser;
import org.junit.Before;
import org.junit.Test;

/**
 * @author imie
 *
 */
public class TestLoadTennisIntegration {

	Jeux jeux;


	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		jeux = new Jeux();
		jeux.setSerialiser(new Serialiser());
	}

	@Test
	public void testIntegrationReset() {
		jeux.marquerJoueur1();
		jeux.marquerJoueur1();
		jeux.marquerJoueur2();
		jeux.marquerJoueur2();
		jeux.save();
		jeux.reset();
		assertEquals("0-0", jeux.getScore());
	}
	
	@Test
	public void testIntegrationSave() {
		jeux.marquerJoueur1();
		jeux.marquerJoueur1();
		jeux.marquerJoueur2();
		jeux.marquerJoueur2();
		jeux.save();
		jeux.reset();
		jeux.load();	
		assertEquals("30-30", jeux.getScore());
	}
	
	


}
