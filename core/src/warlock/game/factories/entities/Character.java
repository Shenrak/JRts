package warlock.game.factories.entities;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Giom on 03/10/2016.
 */
public class Character extends Entity{

    private int hitPoints = 200;
    private int stamina = 100;
    private int gold = 15;
    private boolean alive = true;
    private IMovement movement = null;
    private Array<IEntity> Spell = new Array<IEntity>();


    public Character(int id, Vector2 position) {
        super();
        this.id = id;
        this.position.set(position);

        this.collisionPoints.add(new Vector2());
        this.collisionPoints.add(new Vector2());
        this.collisionPoints.add(new Vector2());
        this.collisionPoints.add(new Vector2());

        this.setOrigin(this.getWidth()/2.f, this.getHeight()/2.f);

    }

    @Override
    public void update() {

    }

    @Override
    public void render(Batch batch) {
        super.render(batch);
    }

    @Override
    public IEntity castSpell(int id) {
        return null;
    }

    @Override
    public void move() {

    }

    @Override
    public void destroy() {

    }
}
