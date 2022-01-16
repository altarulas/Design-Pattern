public class MusicGroup implements MusicComponent{

    private final String SongName, Singer, date;

    public MusicGroup(String SongName, String Singer, String date)
    {
        this.SongName = SongName;
        this.Singer = Singer;
        this.date = date;
    }

    @Override
    public String getSongName() {
        return SongName;
    }

    @Override
    public String getSinger() {
        return Singer;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public void print() {
        System.out.println(SongName +" was recorded by " +Singer+ " in " + date);
    }

    @Override
    public void add(MusicComponent musicComponent) {

    }

    @Override
    public void remove(MusicComponent musicComponent) {

    }

    @Override
    public MusicComponent getChild(int i) {
        return null;
    }
}
