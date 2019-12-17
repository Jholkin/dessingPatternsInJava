package Flyweight;

public class PlayItem {
	private Long id;
	private String songName;
	private byte[] song = new byte[1000000];
	
	public PlayItem(Long id, String songName) {
		this.id = id;
		this.songName = songName;
	}
	
	@Override
	public String toString() {
		return "PlayItem{"+"id="+this.id+", SongName="+this.songName;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public String songName() {
		return this.songName;
	}
}
