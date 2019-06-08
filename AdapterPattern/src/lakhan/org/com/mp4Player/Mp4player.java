package lakhan.org.com.mp4Player;

import lakhan.org.com.Interface.AdvancedMediaPlayer;

public class Mp4player implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		//nothing
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("playing mp4 files name:"+fileName);
	}

}
