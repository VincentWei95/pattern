package interpreter;

public class Scale implements Expression {
    @Override
    public void interpret(PlayContext context) {
        String scale = "";
        switch (String.valueOf(context.getCurrentText())) {
            case "0.5":
            case "1":
                scale = "低音";
                break;
            case "2":
                scale = "中音";
                break;
            case "3":
                scale = "高音";
                break;
        }
        System.out.print(scale + " ");
    }
}
