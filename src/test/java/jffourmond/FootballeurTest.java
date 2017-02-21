package jffourmond;

import static jffourmond.Footballeur.getMeilleurButeur;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FootballeurTest {

	private List<Footballeur> footballeurs;
	
	@Before
	public void init(){
		this.footballeurs = Arrays.asList(
				new Footballeur("Fontaine", 30),
				new Footballeur("Henry", 51),
				new Footballeur("Papin", 30),
				new Footballeur("Platini", 41),
				new Footballeur("Trezeguet", 34), 
				new Footballeur("Zidane", 31)); 
	}

	@Test
	public void testGetMeilleurButeur(){
		assertThat(getMeilleurButeur(footballeurs).get().nom).isEqualTo("Henry");
	}
}
