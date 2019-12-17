package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
	private String playListName;
	private List<PlayItem> playitems = new ArrayList<>();
	
	public PlayList(String playListName) {
		this.playListName = playListName;
	}
	
	public void addPlayItem(String songName) {
		playitems.add(PlayItemFactory.createPlayItem(songName));
	}
	
	public void printList() {
		String out = "\nPlayList > " + this.playListName;
		for (PlayItem playItem : playitems) {
			out += "\n\t" + playItem.toString();
		}
		System.out.print(out);
	}
}
