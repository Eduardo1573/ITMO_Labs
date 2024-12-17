package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import moves.poliwhirl.*;

public class Poliwhirl extends Pokemon {
	
	public Poliwhirl(String name, int level) {
		
		super(name,  level);
		super.setType(Type.WATER);
		super.setStats(40, 50, 40, 40, 40, 90);
		
		BubbleBeam bubblebeam = new BubbleBeam(65, 100);
		Scald scald = new Scald(80, 100);
		Bubble bubble = new Bubble(40, 100);
		
		super.setMove(bubblebeam);
		super.setMove(scald);
		super.setMove(bubble);
		
	}
	
}
