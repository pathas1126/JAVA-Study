package j200213;

enum Song {
	// 상수(정수) 선언
	FIRST(1), SECOND(2), THIRD(3), FOURTH(4);

	final private int track;

	private Song(int track) {
		this.track = track;
	}

	public int getTrack() {
		return track;
	}

}

public class Singer2 {
	public static void main(String[] args) {
		for (Song song : Song.values()) {
			System.out.print(song.getTrack() + "\t");
		}
		// 1 2 3 4
	}
}
