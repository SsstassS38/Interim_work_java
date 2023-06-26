
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        Lottery result = new Lottery();

        ArrayList<Catalog> toylist = new ArrayList<>();
        toylist.add(new Catalog(1, "Бадминтон", 50));
        toylist.add(new Catalog(2, "Ролики", 65));
        toylist.add(new Catalog(3, "Мячик", 15));
        toylist.add(new Catalog(4, "Кукла", 30));
        toylist.add(new Catalog(5, "Паровоз", 20));

        int wins = 10;

        result.fileWriter(toylist, "lottery_result.txt", wins);
        System.out.println("\nРезультаты розыгрыша можно увидеть в файле 'lottery_result.txt'\n");

    }

}

