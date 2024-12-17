package moves.mudsdale;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FocusBlast extends SpecialMove {
	
	public FocusBlast(double pow, double acc) {
		super(Type.FIGHTING, pow, acc);
	}
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}
