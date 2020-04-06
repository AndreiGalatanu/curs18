package ro.fasttrackit.mvnbase;

public class Recursive {


    public int length(String word) {

        if (word == null) throw new IllegalArgumentException("word cannot be null");
        if (word.isEmpty()) {
            return 0;
        } else {
            return 1 + length(word.substring(1));

        }


    }

    public char upperCase(String word) {
        if (Character.isUpperCase(word.charAt(0))) {
            return word.charAt(0);
        }
return 0;
    }
}
