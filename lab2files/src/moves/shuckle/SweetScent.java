package moves.shuckle;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SweetScent extends StatusMove {
	
	public SweetScent(double pow, double acc) {
		super(Type.NORMAL, pow, acc);
	}
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}
	
}
