import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<Stream> {
    private int counter;
    private final List<Stream> GroupsList;


    public StreamIterator(Stream stream) {
        this.counter = 0;
        this.GroupsList = stream.getGroupsList();
    }

    @Override
    public boolean hasNext() {
        return counter < GroupsList.size() - 1;
    }

    @Override
    public Stream next() {
        if (!hasNext()){
            return null;
        }
        return GroupsList.get(++counter);
    }

    @Override
    public void remove() {
        GroupsList.remove(counter);
    }
}
