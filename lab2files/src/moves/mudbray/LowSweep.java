package moves.mudbray;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class LowSweep extends PhysicalMove {
	
	public LowSweep(double pow, double acc) {
		super(Type.FIGHTING, pow, acc);
	}
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}
