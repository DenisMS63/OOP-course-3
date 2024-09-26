import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private Stream stream;
    public List<Stream> getSortedStreams (){
        List<Stream> newStreamList = new ArrayList<>(stream.getGroupsList());
        Collections.sort(newStreamList);
        return newStreamList;
    }
}
