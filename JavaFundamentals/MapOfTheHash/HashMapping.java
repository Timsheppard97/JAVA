import java.util.HashMap;
import java.util.Set;

public class HashMapping {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Adele", "Oh My God");
        trackList.put("Bruno Mars", "Uptown Funk you up");
        trackList.put("Cage The Elephant", "Ain't No Rest For The Wicked");
        trackList.put("Taylor Swift", "Blank Space");

        String taylor = trackList.get("Taylor Swift");
        System.out.println(taylor);

        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}