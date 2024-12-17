package moves.poliwrath;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Bulldoze extends PhysicalMove {
	
	public Bulldoze(double pow, double acc) {
		super(Type.GROUND, pow, acc);
	}
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
	
}
