package org.example;

enum RomanNumbers {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10);
    private int i;

    public int getI() {
        return i;
    }

    RomanNumbers(int i) {
        this.i = i;
    }
}
