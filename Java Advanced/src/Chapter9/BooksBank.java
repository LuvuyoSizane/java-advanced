package Chapter9;

import java.util.ArrayList;
import java.util.List;

public class BooksBank {

    static List<String> bookList(){
        return  new ArrayList<>(
                List.of("Think like me","Buy a lambo for the second time", "Leave my lambo","Buy a lambo")
        );
    }
}
