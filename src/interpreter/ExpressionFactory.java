package interpreter;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExpressionFactory {
    private static Map<String, Expression> expressionMap = new HashMap<>();

    static {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("D:\\develop\\java\\Pattern\\src\\interpreter\\expressionMapper.txt");
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] s = line.split(":");
                if (s.length >= 2) {
                    Class<?> clazz = Class.forName(s[1]);
                    Expression expression = (Expression) clazz.newInstance();
                    expressionMap.put(s[0], expression);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeSilently(fr);
            closeSilently(br);
        }
    }

    private static void closeSilently(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Expression createExpression(String key) {
        return expressionMap.get(key);
    }
}
