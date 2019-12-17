package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class PlayItemFactory {
	public static boolean enableFlyweight = true;
	private static final Map<String,PlayItem> play_items = new HashMap<>();
	private static Long idSequence = 0L;
	
	public static PlayItem createPlayItem(String songName) {
		if (enableFlyweight && play_items.containsKey(songName)) {
			return play_items.get(songName);
		} else {
			PlayItem playItem = new PlayItem(++idSequence,songName);
			play_items.put(songName, playItem);
			return playItem;
		}
	}
	
	/*public boolean getEnableFlyweight() {
		return this.enableFlyweight;
	}
	
	public void setEnableFlyweight(boolean enableFlyweight) {
		this.enableFlyweight = enableFlyweight;
	}*/
}
