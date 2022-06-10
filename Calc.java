package com.exam.exam1;

public class Calc {

    public int run(String s) {

        if ( s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')' ) {
            s= s.substring(1, s.length() - 1);
        }
        if (s.indexOf('-') != -1) {
            return minus(s);
        } else if (s.indexOf('*') != -1) {
            return multi(s);
        } else if (s.indexOf('/') != -1) {
            return devide(s);
        }
        return plus(s);
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

