package warlock.game.factories;

import com.badlogic.gdx.graphics.g2d.Batch;

/**
 * Created by Giom on 03/10/2016.
 */
public interface IEntity {

    void update();
    void render(Batch batch);
    IEntity castSpell(int id);
    void move();
    void destroy();

}
