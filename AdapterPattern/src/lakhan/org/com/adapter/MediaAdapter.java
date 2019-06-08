package lakhan.org.com.adapter;

import lakhan.org.com.Interface.AdvancedMediaPlayer;
import lakhan.org.com.Interface.MediaPlayer;
import lakhan.org.com.mp4Player.Mp4player;
import lakhan.org.com.vlc.Vlcplayer;

public class MediaAdapter implements MediaPlayer{

	AdvancedMediaPlayer advancedMusicPlayer;

	   public MediaAdapter(String audioType){
	      if(audioType.equalsIgnoreCase("vlc") ){
	         advancedMusicPlayer = new Vlcplayer();			
	      } else if (audioType.equalsIgnoreCase("mp4")){
	         advancedMusicPlayer = new Mp4player();
	      }	
	   }

	   @Override
	   public void play(String audioType, String fileName) {
	      if(audioType.equalsIgnoreCase("vlc")){
	         advancedMusicPlayer.playVlc(fileName);
	      }else if(audioType.equalsIgnoreCase("mp4")){
	         advancedMusicPlayer.playMp4(fileName);
	      }
	   }

}
