package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import moves.mudsdale.*;

public class Mudsdale extends Pokemon {
	
	public Mudsdale(String name, int level) {
		
		super(name,  level);
		super.setType(Type.GROUND);
		super.setStats(100, 25, 100, 55, 85, 35);
		
		Confide confide = new Confide(0, 0);
		FocusBlast focusblast = new FocusBlast(120, 70);
		HighHorsepower highhorsepower = new HighHorsepower(95, 95);
		LowSweep lowsweep = new LowSweep(65, 100);
		
		super.setMove(confide);
		super.setMove(focusblast);
		super.setMove(highhorsepower);
		super.setMove(lowsweep);
		
	}
	
}
