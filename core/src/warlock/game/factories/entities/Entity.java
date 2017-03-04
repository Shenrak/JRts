package warlock.game.factories.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import warlock.game.factories.IEntity;

/**
 * Created by Giom on 03/10/2016.
 */
public abstract class Entity extends Sprite implements IEntity{

    protected int id = 0;
    protected float delta = 0;
    protected Vector2 position = new Vector2();
    protected Array<Vector2> collisionPoints = new Array<Vector2>();
    protected Vector2 collisionCenter = new Vector2();

    @Override
    public void update() {
        delta = Math.min(0.06f, Gdx.graphics.getDeltaTime());

        collisionPoints.get(0).set( this.getVertices()[0], this.getVertices()[1]);
        collisionPoints.get(1).set( this.getVertices()[5], this.getVertices()[6]);
        collisionPoints.get(2).set( this.getVertices()[10], this.getVertices()[11]);
        collisionPoints.get(3).set( this.getVertices()[15], this.getVertices()[16]);

        collisionCenter.set(collisionPoints.get(0)).add(collisionPoints.get(2)).scl(0.5f);
    }

    @Override
    public void render(Batch batch) {
        super.draw(batch);
    }
}
