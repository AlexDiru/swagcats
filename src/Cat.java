import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Cat extends Object2D {

	private boolean appeared = false;
	private static Random random = new Random();
	
	public Cat() {
	}
	
	public void render(SpriteBatch spriteBatch) {
		if (appeared)
			spriteBatch.draw(Assets.catTexture, x,y);
	}
	
	public void appear() {
		if (!appeared) {
			x = random.nextInt(Gdx.graphics.getWidth() - Assets.catTexture.getWidth());
			y = random.nextInt(Gdx.graphics.getHeight() - Assets.catTexture.getHeight());
			appeared = true;
		}
	}

	public boolean isAppeared() {
		return appeared;
	}
	
	public boolean isClicked(int mx, int my) {
		return (mx >= x && my >= y && mx < x + Assets.catTexture.getWidth() && my < y + Assets.catTexture.getHeight());
	}

	public void dissappear() {
		appeared = false;
	}
}
