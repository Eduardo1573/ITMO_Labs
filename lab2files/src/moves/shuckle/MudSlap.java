package moves.shuckle;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class MudSlap extends SpecialMove {
	
	public MudSlap(double pow, double acc) {
		super(Type.GROUND, pow, acc);
	}
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");
		return "does " + pieces[pieces.length-1];
	}

}
