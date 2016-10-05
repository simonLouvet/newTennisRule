package org.imie.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.imie.ISerialiser;
import org.imie.Jeux;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class) 
public class TestLoadTennisMockitoV2 {

	@Mock
	private ISerialiser serialiser;

	private Jeux jeux ;
	
	
	@Before
	public void setUp() throws Exception {

		jeux= new Jeux();
		jeux.setSerialiser(serialiser);

	}

	@Test
	public void test() {
		Jeux savedJeux = new Jeux();
		savedJeux.marquerJoueur1();
		savedJeux.marquerJoueur1();
		savedJeux.marquerJoueur2();
		savedJeux.marquerJoueur2();

		when(serialiser.read()).thenReturn(savedJeux);
		
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
