package moves.poliwhirl;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Scald extends SpecialMove {
	
	public Scald(double pow, double acc) {
		super(Type.WATER, pow, acc);
	}
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
	
}
