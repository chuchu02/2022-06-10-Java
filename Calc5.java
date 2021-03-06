package com.exam.exam1;

public class Calc5 {
    public int run(String s) {

        s = splitOuterBrackets(s);
        String operatorCode = getOperatorCode(s);

        if (operatorCode.equals("number")) {
            return Integer.parseInt(s);
        } else if (operatorCode.equals("+")) {
            return plus(s);
        } else if (operatorCode.equals("-")) {
            return minus(s);
        } else if (operatorCode.equals("*")) {
            return multi(s);
        } else if (operatorCode.equals("/")) {
            return devide(s);
        }

        int splitIndex = 0;
        boolean isPlus = true;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '+' || s.charAt(i) == '-') {
                splitIndex = i;
                if(s.charAt(i) == '-') {
                    isPlus = false;
                }
                break;
            }
        }

        String head = s.substring(0, splitIndex).trim();
        String tail = s.substring(splitIndex + 1, s.length()).trim();

        if(isPlus) {
            return run(head) + run(tail);
        }
        return run(head) - run(tail);

    }

    private String splitOuterBrackets(String s) {
        s = s.trim();

        if (s.length() == 0) {
            return s;
        }

        while (s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')') {
            s = s.substring(1, s.length() - 1);
        }
        return s;
    }

    private String getOperatorCode(String s) {
        try {
            Integer.parseInt(s);
            return "number";
        } catch (NumberFormatException e) {

        }

        int nonNumberOperatorCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' ||
                    s.charAt(i) == '/') {
                nonNumberOperatorCount++;
            }
        }

        if (nonNumberOperatorCount == 1) {
            if(s.indexOf('(') != -1) return "(";
            if(s.indexOf('(') != -1) return "(";
            if (s.indexOf('+') != -1) return "+";
            if (s.indexOf('-') != -1) return "-";
            if (s.indexOf('*') != -1) return "*";
            if (s.indexOf('/') != -1) return "/";
        }

        return "splitInTwo";
    }

    private int plus(String s) {
        String[] sBits = s.split(" \\+ ");
        int a = Integer.parseInt(sBits[0]);
        int b = Integer.parseInt(sBits[1]);
        return a + b;
    }
    private int minus(String s) {
        String[] sBits = s.split(" \\- ");
        int a = Integer.parseInt(sBits[0]);
        int b = Integer.parseInt(sBits[1]);
        return a - b;
    }
    private int multi(String s) {
        String[] sBits = s.split(" \\* ");
        int a = Integer.parseInt(sBits[0]);
        int b = Integer.parseInt(sBits[1]);
        return a * b;
    }
    private int devide(String s) {
        String[] sBits = s.split(" \\/ ");
        int a = Integer.parseInt(sBits[0]);
        int b = Integer.parseInt(sBits[1]);
        return a / b;
    }


}
