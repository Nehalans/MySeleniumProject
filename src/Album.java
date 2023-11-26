import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String name;
	private String artist;
	private ArrayList<Musicplayer> songs; 
	
	public Album(String name,String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Musicplayer>();
		
	}
	public Album() {
		
	}
	
	public Musicplayer findMusicplayer(String name) {
		for(Musicplayer checkedMusicplayer:songs) {
			if(checkedMusicplayer.getTitle().equals(name))
				return checkedMusicplayer;
		}
		return null;
	}
	
	public boolean addMusicplayer(String name, double duration) {
		if(findMusicplayer(name) == null) {
			songs.add(new Musicplayer(name, duration));
			System.out.println(name +"Successfully added to the list");
			return true;
		}
		else {
			System.out.println("song with name" + name+ "Already exist in the list");
			return false;
		}
	}
	
	public boolean addToPlayList(int trackNumber, LinkedList<Musicplayer> PlayList) {
		int index = trackNumber -1;
		if (index > 0 && index <=this.songs.size()) {
			PlayList.add(this.songs.get(index));
			return true;
		}
		System.out.println("this album does not have song with trackNumber"+trackNumber);
		return false;
	}
	
	public boolean addToPlayList(String name, LinkedList<Musicplayer> PlayList){
		for(Musicplayer checkedMusicplayer :this.songs) {
			if(checkedMusicplayer.getTitle().equals(name)) {
				PlayList.add(checkedMusicplayer);
				return true;
			}
		}
		System.out.println(name + "there is no such song in album");
		return false;
	}
}
