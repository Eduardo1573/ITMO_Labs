package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import moves.poliwrath.*;

public class Poliwrath extends Pokemon {
	
	public Poliwrath(String name, int level) {
		
		super(name,  level);
		super.setType(Type.WATER);
		super.setStats(40, 50, 40, 40, 40, 90);
		
		BubbleBeam bubblebeam = new BubbleBeam(65, 100);
		Scald scald = new Scald(80, 100);
		Bubble bubble = new Bubble(40, 100);
		Bulldoze bulldoze = new Bulldoze(60, 100);
		
		super.setMove(bubblebeam);
		super.setMove(scald);
		super.setMove(bubble);
		super.setMove(bulldoze);
		
	}
	
}
