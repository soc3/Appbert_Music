/**
 * Created by sushant oberoi on 09-09-2016.
 */
public class MusicService {
    public int getPosn(){
        return player.getCurrentPosition();
    }

    public int getDur(){
        return player.getDuration();
    }

    public boolean isPng(){
        return player.isPlaying();
    }

    public void pausePlayer(){
        player.pause();
    }

    public void seek(int posn){
        player.seekTo(posn);
    }

    public void go(){
        player.start();
    }
    public void playNext(){
        songPosn++;
        if(songPosn&gt;=songs.size()) songPosn=0;
        playSong();
    }
    public void playPrev(){
        songPosn--;
        if(songPosn&lt;0) songPosn=songs.size()-1;
        playSong();
    }
}
