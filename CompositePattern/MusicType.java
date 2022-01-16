import java.util.ArrayList;
import java.util.Iterator;

public class MusicType implements MusicComponent{

    ArrayList<MusicComponent> musicComponents = new ArrayList<>();

    private final String description;

    public MusicType(String description)
    {
        this.description = description;
    }


    @Override
    public String getSongName() {
        return null;
    }

    @Override
    public String getSinger() {
        return null;
    }

    @Override
    public String getDate() {
        return null;
    }

    @Override
    public void add(MusicComponent musicComponent) {
        musicComponents.add(musicComponent);
    }

    @Override
    public void remove(MusicComponent musicComponent) {
        musicComponents.remove(musicComponent);
    }

    @Override
    public void print() {

        System.out.println(description);
        System.out.println();

        Iterator<MusicComponent> iterator = musicComponents.iterator();

        while(iterator.hasNext())
        {
            MusicComponent musicComponent = iterator.next();
            musicComponent.print();
        }

        System.out.println();

    }

    @Override
    public MusicComponent getChild(int i) {
        return musicComponents.get(i);
    }
}
