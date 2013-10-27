import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;


public class Assets {

	public static Texture catTexture;
	
	public static void load() {
		Gdx.files = new com.badlogic.gdx.backends.lwjgl.LwjglFiles();
		catTexture = new Texture(Gdx.files.internal("assets/cat.png"));
	}
	
}
