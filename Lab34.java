import java.util.*;

interface Stateful {
    void nextAct();
}

enum GravityState {
    NORMAL, ZERO
}

interface TvProgram {
    void play();
}

class OrbitException extends Exception {
    public OrbitException(String message) {
        super(message);
    }
}

abstract class Character implements Stateful {
    protected String name;
    protected GravityState gravityState;

    public Character(String name) {
        this.name = name;
        this.gravityState = GravityState.NORMAL;
    }

    public void zeroGravity() {
        this.gravityState = GravityState.ZERO;
        System.out.println(name + " попал в состояние невесомости.");
    }

    public void exitZeroGravity() {
        this.gravityState = GravityState.NORMAL;
        System.out.println(name + " вернулся в нормальное состояние гравитации.");
    }

    public abstract void act();
}

record TV(String channel, TvProgram program) {}

class SpaceNews implements TvProgram {
    @Override
    public void play() {
        System.out.println("В эфире передача о космонавтах. Рассказ о жизни на орбите...");
    }
}

class DancingShow implements TvProgram {
    @Override
    public void play() {
        System.out.println("В эфире танцевальное шоу. Пары кружатся в ритме вальса!");
    }
}

class Viewer extends Character {
    public Viewer(String name) {
        super(name);
    }
    
    @Override
    public void act() {
        System.out.println(name + " смотрит телевизор и ждет передачу о космонавтах.");
    }

    @Override
    public void nextAct() {
        System.out.println(name + " смотрит передачу о космонавтах.");
    }
}

class Policeman extends Character {
    private boolean hasRifle;
    private boolean aboutToLand;

    public Policeman(String name) {
        super(name);
        this.hasRifle = new Random().nextDouble() < 0.707;
        this.aboutToLand = new Random().nextDouble() < 0.707 && hasRifle;
    }

    public void shoot() throws Exception {
        if (!hasRifle) {
            throw new Exception(name + " не может стрелять без винтовки!");
        }
        System.out.println(name + " стреляет из дальнобойной винтовки и улетает на орбиту");
        zeroGravity();
    }
    
    
    public void land() throws OrbitException {
        if(hasRifle) {
            if (!aboutToLand) {
                throw new OrbitException(name + " остался витать по орбите!");
            }
            System.out.println(name + " приземлился");
            exitZeroGravity();
        } else {System.out.println(name + " всё так же на земле");}
    }

    @Override
    public void act() {
        try {
            shoot();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void nextAct() {
        try {
            land();
        } catch (OrbitException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Lab34 {
    public static void main(String[] args) {
        TV tv1 = new TV("Канал 1", new DancingShow());
        TV tv2 = new TV("Канал 2", new SpaceNews());

        Viewer viewer1 = new Viewer("Иван");
        Viewer viewer2 = new Viewer("Мария");
        Policeman policeman = new Policeman("Хныгль");

        List<Character> characters = new ArrayList<>(List.of(viewer1, viewer2, policeman));

        tv1.program().play();
        for (Character character : characters) {
            character.act();
        }

        tv2.program().play();
        for (Character character : characters) {
            character.nextAct();
        }
    }
}
