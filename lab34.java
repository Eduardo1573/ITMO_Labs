import java.util.*;

interface Stateful {
    void NextAct();
}

enum GravityState {
    NORMAL, ZERO
}

abstract class Character implements Stateful {
    protected String name;
    protected GravityState gravityState;

    public Character(String name) {
        this.name = name;
        this.gravityState = GravityState.NORMAL;
    }

    public void ZeroGravity() {
        this.gravityState = GravityState.ZERO;
        System.out.println(name + " попал в состояние невесомости.");
    }

    public void ExitZeroGravity() {
        this.gravityState = GravityState.NORMAL;
        System.out.println(name + " вернулся в нормальное состояние гравитации.");
    }

    public abstract void act();
}

record TV(String channel) {}

class Viewer extends Character {
    private TV tv;

    public Viewer(String name, TV tv) {
        super(name);
        this.tv = tv;
    }

    @Override
    public void act() {
        System.out.println(name + " смотрит телевизор и ждет передачу о космонавтах.");
    }

    @Override
    public void NextAct() {
        System.out.println(name + " продолжает наблюдать за экраном.");
    }
}

class Policeman extends Character {
    private boolean hasRifle;

    public Policeman(String name) {
        super(name);
        this.hasRifle = true;
    }

    public void shoot() throws Exception {
        if (!hasRifle) {
            throw new Exception(name + " не может стрелять без винтовки!");
        }
        System.out.println(name + " стреляет из дальнобойной винтовки.");
        ZeroGravity();
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
    public void NextAct() {
        if (gravityState == GravityState.ZERO) {
            System.out.println(name + " несется вокруг Луны в невесомости.");
        }
    }
}

class lab34 {
    public static void main(String[] args) {
        TV tv = new TV("Канал космонавтики");
        Viewer viewer1 = new Viewer("Иван", tv);
        Viewer viewer2 = new Viewer("Мария", tv);
        Policeman policeman = new Policeman("Хныгль");

        List <Character> characters = new ArrayList <> (List.of(viewer1, viewer2, policeman));

        System.out.println("На экране появились танцующие пары...");
        for (Character character : characters) {
            character.act();
        }

        System.out.println("Новости о космонавтах начались!");
        for (Character character : characters) {
            character.NextAct();
        }
    }
}
