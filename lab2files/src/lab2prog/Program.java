package lab2prog;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

import pokemons.*;

public class Program {

	public static void main(String[] args) {
		
		Battle b = new Battle();
		
		Shuckle shuckle = new Shuckle("Oleg", 1);
		Mudbray mudbray = new Mudbray("Dima", 1);
		Mudsdale mudsdale = new Mudsdale("Ivan", 1);
		
		Poliwag poliwag = new Poliwag("John", 1);
		Poliwhirl poliwhirl = new Poliwhirl("Chris", 1);
		Poliwrath poliwrath = new Poliwrath("Paul", 1);
		
		b.addAlly(shuckle);
		b.addAlly(mudbray);
		b.addAlly(mudsdale);
		
		b.addFoe(poliwag);
		b.addFoe(poliwhirl);
		b.addFoe(poliwrath);
		
		b.go();

	}

}
