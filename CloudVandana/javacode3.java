3.Check if the input is pangram or not.(A pangram is a sentences that contains all the alphabets from A to Z)
..................................................................................................................


public class PangramCheck {
    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (str.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(sentence);
        System.out.println("Is the sentence a pangram? " + isPangram);
    }
}

OUTPUT: Is the sentences a pangram?True
