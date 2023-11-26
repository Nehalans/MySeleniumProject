
public class Main {
	public static void main(String[] args) {
		
		Album album = new Album("Album1", "ac/dc");
		
		album.addMusicplayer("TNT", 4.5);
		album.addMusicplayer("Highway to hell", 3.5);
		album.addMusicplayer("ThunderStruck", 5.0);
		album.addMusicplayer("Believer", 4.0);
		
		album = new Album("Album2", "Eminem");
		
		album.addMusicplayer("rap god", 3.5);
		album.addMusicplayer("rap god", 4.5);
		album.addMusicplayer("lose yourself", 5.0);
		
		
	}

}
