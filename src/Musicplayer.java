
public class Musicplayer {
	
	String name;
	double duration;
	 
    public Musicplayer(String name, double duration) {
    	this.name = name;
    	this.duration = duration;
    }
    
    public Musicplayer() {
    	
    }
    public String getTitle() {
		return name;
    	
    }
    public Double getDuration() {
		return duration;
    	
    }
    @Override
    public String toString() {
    	return "Musicplayer{" +
                "name='" + name +'\'' + 
                ",duration=" + duration +
                '}';
    }
}
