import java.util.List;

public class IsikukoodiRegister {
    private List<String> isikukoodid;

    public synchronized void registreeri(String isikukood){
        if (!isikukoodid.contains(isikukood)) isikukoodid.add(isikukood);
    }

    public synchronized int järjekorranumber(String isikukood){
        for (int i = 0; i < isikukoodid.size(); i++) {
            if (isikukood.equals(isikukoodid.get(i))) return i;
        }
        return -1;
    }
}
