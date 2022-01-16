public interface MusicComponent {

     String getSongName();
     String getSinger();
     String getDate();

     void print();
     void add(MusicComponent musicComponent);
     void remove(MusicComponent musicComponent);

     MusicComponent getChild(int i);
}
