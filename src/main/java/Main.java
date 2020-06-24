import com.what3words.javawrapper.What3WordsV3;
import com.what3words.javawrapper.request.Coordinates;
import com.what3words.javawrapper.response.ConvertTo3WA;

public class Main {

    public static void main(String[] args) {

        //System.out.println('' + ${project.basedir});


        What3WordsV3 api = new What3WordsV3("V8UG7ICS");

        ConvertTo3WA words = api.convertTo3wa(new Coordinates(51.508344, -0.12549900))
                .language("en")
                .execute();
        System.out.println("Words: " + words);
    }

}
