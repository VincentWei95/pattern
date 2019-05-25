package interpreter;

public class Note implements Expression {
    @Override
    public void interpret(PlayContext context) {
        String note = "";
        switch (context.getCurrentText()) {
            case 'C':
                note = "1";
                break;
            case 'D':
                note = "2";
                break;
            case 'E':
                note = "3";
                break;
            case 'F':
                note = "4";
                break;
            case 'G':
                note = "5";
                break;
            case 'A':
                note = "6";
                break;
            case 'B':
                note = "7";
                break;
        }
        System.out.print(note + " ");
    }
}
