package moves.mudsdale;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class HighHorsepower extends PhysicalMove {
	
	public HighHorsepower(double pow, double acc) {
		super(Type.GROUND, pow, acc);
	}
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}
