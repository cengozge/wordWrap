package kata;

public class WordWraper {

    public static void main(String[] args){
        System.out.print(wrap("ozgegokay okula gidiyor", 3));
    }

    public static String wrap(String word, int col){

        if (word == null || word.length() <= col)
            return word;
        else
            return (word.substring(0, col) + "\n" + wrap(word.substring(col), col));

    }

}
