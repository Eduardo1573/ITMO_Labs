import java.util.*;

interface Stateful {
    void updateState();
}

enum GravityState {
    NORMAL, ZERO_GRAVITY
}

abstract class Character implements Stateful {
    protected String name;
    protected GravityState gravityState;

    public Character(String name) {
        this.name = name;
        this.gravityState = GravityState.NORMAL;
    }

    public void enterZeroGravity() {
        this.gravityState = GravityState.ZERO_GRAVITY;
        System.out.println(name + " попал в состояние невесомости.");
    }

    public void exitZeroGravity() {
        this.gravityState = GravityState.NORMAL;
        System.out.println(name + " вернулся в нормальное состояние гравитации.");
    }

    public abstract void act();
}

record Television(String channel) {}

class Viewer extends Character {
    private Television tv;

    public Viewer(String name, Television tv) {
        super(name);
        this.tv = tv;
    }

    @Override
    public void act() {
        System.out.println(name + " смотрит телевизор и ждет передачу о космонавтах.");
    }

    @Override
    public void updateState() {
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
        enterZeroGravity();
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
    public void updateState() {
        if (gravityState == GravityState.ZERO_GRAVITY) {
            System.out.println(name + " несется вокруг Луны в невесомости.");
        }
    }
}

class LunarWorld {
    public static void main(String[] args) {
        Television tv = new Television("Канал космонавтики");
        Viewer viewer1 = new Viewer("Иван", tv);
        Viewer viewer2 = new Viewer("Мария", tv);
        Policeman policeman = new Policeman("Хныгль");

        List<Character> characters = new ArrayList<>(List.of(viewer1, viewer2, policeman));

        System.out.println("На экране появились танцующие пары...");
        for (Character character : characters) {
            character.act();
        }

        System.out.println("Новости о космонавтах начались!");
        for (Character character : characters) {
            character.updateState();
        }
    }
}
