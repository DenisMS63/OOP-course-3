import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        return Integer.compare(o2.getGroupsList().size(), o1.getGroupsList().size());

//        if (o1.getStudentGroupList().size() < o2.getStudentGroupList().size()){
//            return 1;
//        }
//        if (o1.getStudentGroupList().size() > o2.getStudentGroupList().size()){
//            return -1;
//        } else {
//            return 0;
//        }
    }
}
