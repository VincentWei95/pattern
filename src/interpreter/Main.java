package interpreter;

import java.io.*;

/**
 * 解释器模式：
 * 定义：给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子
 *
 * （简单理解：解释器模式就是每一条规则都新建一个类来处理外部传递过来的文法需要处理的规则）
 *
 * 解释器模式的好处：
 * 容易改变和扩展文法，因为该模式使用类来表示文法规则，你可使用继承来改变或扩展该文法。
 * 也比较容易实现文法，因为定义抽象语法树中各个节点的类的实现大体类似，这些类都易于直接编写
 *
 * 解释器模式的不足：
 * 为文法中的每一条规则至少定义一个类，因此包含许多规则的文法可能难以管理和维护。
 * 建议当文法非常复杂时，使用其他的技术如语法分析程序或编译器生成器来处理
 *
 * 使用场景：
 * 如果一种特定类型的问题发生的频率足够高，那么可能就值得将该问题的各个实例表述为一个简单语言中的句子。
 * 这样就可以构建一个解释器，该解释器通过解释这些句子来解决问题。比如字符串正则表达式匹配
 *
 * 模式例子对象成员说明：
 * {@link Expression}:解释器接口，提供解释接口，音乐音符表达接口
 * {@link Note}:解释器接口实现类，持有解释器全局信息Context，音乐音符字母解释器
 * {@link Scale}:解释器接口实现类，持有解释器全局信息Context，音乐音符数字解释器
 *
 * {@link PlayContext}:解释器全局信息封装类，提供解释器需要解析的数据
 *
 * {@link ExpressionFactory}:解释器简单工厂
 */
public class Main {

    public static void main(String[] args) {
        PlayContext context = new PlayContext();
        context.setPlayText("O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A" +
                " 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3");
        String playText = context.getPlayText().trim();
        int length = playText.length();
        for (int i = 0; i < length; i++) {
            char c = playText.charAt(i);
            context.setCurrentText(c);
            Expression expression = ExpressionFactory.createExpression(String.valueOf(c));
            if (expression != null) {
                expression.interpret(context);
            }
        }
    }
}
