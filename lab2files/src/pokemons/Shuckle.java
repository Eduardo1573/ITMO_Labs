package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import moves.shuckle.*;

public class Shuckle extends Pokemon {
	
	public Shuckle(String name, int level) {
		
		super(name,  level);
		super.setType(Type.BUG, Type.ROCK);
		super.setStats(20, 10, 230, 10, 230, 5);
		
		MudSlap mudslap = new MudSlap(20, 100);
		Rest rest = new Rest(0, 0);
		RockTomb rocktomb = new RockTomb(60, 95);
		SweetScent sweetscent = new SweetScent(0, 100);
		
		super.setMove(mudslap);
		super.setMove(rest);
		super.setMove(rocktomb);
		super.setMove(sweetscent);
		
	}
	
}
