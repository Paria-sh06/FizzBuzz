import java.util.HashMap;

public class GameInfo {

    public HashMap<Integer, String> numbersAndWordsOfGame = new HashMap<>();

    public void addNumberAndWord(int number, String word)
    {
        numbersAndWordsOfGame.put(number, word);
    }

    public void editWordOfNumber(int number, String newWord)
    {
        numbersAndWordsOfGame.put(number, newWord);
    }

    public void deleteNumberAndWord(int number)
    {
        numbersAndWordsOfGame.remove(number);
    }
}