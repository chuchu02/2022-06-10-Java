package PP;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class Calc {

    public void run(String s) {
        resultPrint(organize(s));
    }

    private String[] organize(String s) {
        boolean isBracket = false;

        if(s.charAt(0) == '(') {
            isBracket = true;
        }

        s = s.replace("(", " ( ");
        s = s.replace(")", " ) ");
        s = s.replace("+", " + ");
        s = s.replace("-", " - ");
        s = s.replace("*", " * ");
        s = s.replace("/", " / ");
        s = s.replace("  ", " ");
        String[] str = s.split(" ");

        ArrayList<String> sb = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < str.length; i++) {
            String now = str[i];

            switch (now) {
                case "+":
                case "-":
                case "*":
                case "/":
                    while(!stack.isEmpty() && priority(stack.peek()) >= priority(now)) {
                        sb.add(stack.pop());
                    }
                    stack.push(now);
                    break;
                case "(":
                    stack.push(now);
                    break;
                case ")":
                    stack.push(now);
                    break;
                default:
                    sb.add(now);
            }
        }

        while (!stack.isEmpty()) {
            sb.add(stack.pop());
        }

        if(isBracket) {
            sb.remove(0);
        }

        String[] result = new String[sb.size()];

        for(int i =0; i < sb.size(); i++) {
            result[i] = sb.get(i);
        }
        return result;
    }

    private int priority(String operator) {

        if(operator.equals("(") || operator.equals(")")) {
            return 0;
        } else if (operator.equals("+") || operator.equals("-")) {
            return 1;
        } else if (operator.equals("*") || operator.equals("/")) {
            return 2;
        }
        return -1;
    }

    private void resultPrint(String[] str) {

        Stack<Integer> stack = new Stack<>();

        for(String x : str) {
            if(!x.equals("+") && !x.equals("-") && !x.equals("*") && !x.equals("/")) {
                stack.push(Integer.parseInt(x));
            } else {

                int a = stack.pop();
                int b = stack.pop();

                switch (x) {
                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(a-b);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                    case "/":
                        stack.push(a/b);
                        break;
                }
            }
        }
        System.out.println(stack.pop());
    }


}
