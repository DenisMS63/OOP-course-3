import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>, Comparable<Stream>{
    private List<Stream> GroupsList;

    public List<Stream> getGroupsList() {
        return GroupsList;
    }

    public void setGroupsList(List<Stream> GroupsList) {
        this.GroupsList = GroupsList;
    }

    @Override
    public Iterator<Stream> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public int compareTo(Stream o) {
        if (this.GroupsList.size() < o.GroupsList.size()){
            return -1;
        } else if (this.GroupsList.size() > o.GroupsList.size()){
                    return 1;
        } else return 0;
    }
}
