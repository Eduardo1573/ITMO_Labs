package moves.shuckle;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class RockTomb extends PhysicalMove {
	
	public RockTomb(double pow, double acc) {
		super(Type.ROCK, pow, acc);
	}
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
	
}
