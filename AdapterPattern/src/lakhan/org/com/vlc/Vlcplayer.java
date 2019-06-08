package lakhan.org.com.vlc;

import lakhan.org.com.Interface.AdvancedMediaPlayer;

public class Vlcplayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("playing vlc file name:"+fileName);
	}

	@Override
	public void playMp4(String fileName) {
	//nothing
		
	}

}
