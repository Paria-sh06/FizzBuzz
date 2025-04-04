public class Main {
    public static void main(String[] args) {

        GameInfo gameVersion1 = new GameInfo();

        gameVersion1.addNumberAndWord(3, "Fizz");
        gameVersion1.addNumberAndWord(5, "Buzz");

        int start = 1;
        int end = 100;

        for(int i = start; i <= end; i++) {

            String output = "";

            for (Integer key : gameVersion1.numbersAndWordsOfGame.keySet()) {

                if(i % key == 0)
                    output = output.concat(gameVersion1.numbersAndWordsOfGame.get(key));

            }

            if(output.equals(""))
                output = Integer.toString(i);

            System.out.println(output);
        }
    }
}