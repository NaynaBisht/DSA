package CompetitiveCoding;

public class MoveHyphens {
    public static void main(String[] args) {
        System.out.println(moveHyphens("--hey-the-re--"));
    }
    static String moveHyphens(String str){
        StringBuilder hyphens = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for(char c : str.toCharArray()) {
            if (c == '-')
                hyphens.append(c);
            else
                others.append(c);
        }
        return hyphens.append(others).toString();
    }
}
