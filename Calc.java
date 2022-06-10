package com.exam.exam1;

public class Calc {

    public int run(String s) {
        s = stripOuterBrackets(s);

        String operatorCode = getOperatorCode(s);

        if (operatorCode.equals("-")) {
            return minus(s);
        } else if (operatorCode.equals("*")) {
            return multi(s);
        } else if (operatorCode.equals("/")) {
            return devide(s);
        } else if (operatorCode.equals("/")) {
            return plus(s);
        }
        return 0;
    }

    private String getOperatorCode(String s) {
        if(s.indexOf('-') != -1) return "-";
        if(s.indexOf('+') != -1) return "+";
        if(s.indexOf('*') != -1) return "*";
        if(s.indexOf('/') != -1) return "/";

        return "unknown";
    }

    private String stripOuterBrackets(String s) {
        while (s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')') {
            s = s.substring(1, s.length() - 1);
        }
        return s;
    }

    private int devide(String s) {
        String[] sBits = s.split(" \\/ ");
        int a = Integer.parseInt(sBits[0]);
        int b = Integer.parseInt(sBits[1]);

        return a / b;
    }

    private int multi(String s) {
        String[] sBits = s.split(" \\* ");
        int a = Integer.parseInt(sBits[0]);
        int b = Integer.parseInt(sBits[1]);

        return a * b;
    }

    public int plus(String s) {
        String[] sBits = s.split(" \\+ ");
        int a = Integer.parseInt(sBits[0]);
        int b = Integer.parseInt(sBits[1]);

        return a + b;
    }

    public int minus(String s) {
        String[] sBits = s.split(" \\- ");
        int a = Integer.parseInt(sBits[0]);
        int b = Integer.parseInt(sBits[1]);

        return a - b;
    }


}

