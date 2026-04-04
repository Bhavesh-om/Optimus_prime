
interface Media{
    void play();
}

class Music implements Media{
    @Override
    public void play(){
       System.out.println("Playing Song!!!");
   }
}

class Video implements Media{
    @Override
    public void play(){
        System.out.println("Playing Movie!!!");
    }
}
class Radio implements Media{
    @Override
    public void play(){
        System.out.println("Playing Radio!!!");
    }
}
public class interfaces{
    public static void main(String[] args) {
       Media myplayer;
       myplayer= new Music();
       myplayer.play();

       myplayer= new Video();
       myplayer.play();

       myplayer= new Radio();
       myplayer.play();
    }
}
