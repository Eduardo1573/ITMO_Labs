package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import moves.mudbray.*;

public class Mudbray extends Pokemon {
	
	public Mudbray(String name, int level) {
		
		super(name,  level);
		super.setType(Type.GROUND);
		super.setStats(70, 100, 70, 45, 55, 45);
		
		Confide confide = new Confide(0, 0);
		HighHorsepower highhorsepower = new HighHorsepower(95, 95);
		LowSweep lowsweep = new LowSweep(65, 100);
		
		super.setMove(confide);
		super.setMove(highhorsepower);
		super.setMove(lowsweep);
		
	}
	
}
