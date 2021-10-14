package hk.edu.polyu.comp.comp2021.assignment2.complex;
//


//他妈的这个other是怎么调用的啊

//

public class Rational {
    // Task 1: add the missing fields
    public static void main(String[] args) {
        System.out.println();
    }
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        // Task 2: complete the constructor
        //不是很确定写不写这个
//        //if(this.denominator == 0){
//            return null;
//        }
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public Rational add(Rational other) {
        // Task 2: complete the method
        int b;
        int a;
        int d;
        int c;
        d = other.numerator;
        c = other.denominator;
        b = this.numerator;
        a = this.denominator;
        this.denominator = c * a;
        this.numerator = c * b + a * d;
        Rational answer = new Rational(0,0);
        answer.numerator = this.numerator;
        answer.denominator = this.denominator;
        return answer;
    }

    public Rational subtract(Rational other) {
        // Task 2: complete the method
        int b;
        int a;
        int d;
        int c;
        d = other.numerator;
        c = other.denominator;
        b = this.numerator;
        a = this.denominator;
        this.denominator = c * a;
        this.numerator = c * b - a * d;
        Rational answer = new Rational(0,0);
        answer.numerator = this.numerator;
        answer.denominator = this.denominator;
        return answer;
    }

    public Rational multiply(Rational other) {
        // Task 2: complete the method
        int b;
        int a;
        int d;
        int c;
        d = other.numerator;
        c = other.denominator;
        b = this.numerator;
        a = this.denominator;
        this.denominator = c * a;
        this.numerator = b * d;
        Rational answer = new Rational(0,0);
        answer.numerator = this.numerator;
        answer.denominator = this.denominator;
        return answer;
    }

    public Rational divide(Rational other) {
        // Task 2: complete the method
        int b;
        int a;
        int d;
        int c;
        d = other.numerator;
        c = other.denominator;
        b = this.numerator;
        a = this.denominator;
        this.numerator = c * b;
        this.denominator = a * d;
        Rational answer = new Rational(0,0);
        answer.numerator = this.numerator;
        answer.denominator = this.denominator;
        return answer;
    }

    //看一下这里原始的输入是什么
    public String toString() {
        // Task 2: complete the method
        String to1 = this.numerator+"" ;
        String to2 = this.denominator+"";
        return to1+"/"+to2;
    }

    public Rational nb(Rational other){
        this.numerator = other.numerator;
        this.denominator = other.denominator;
        Rational answer = new Rational(0,0);
        answer.numerator = this.numerator;
        answer.denominator = this.denominator;
        return answer;
    }

    public void simplify() {
        // Task 2: complete the method
        int a;
        int b;
        int zhengfu = 0;
        int count = 0;
        if(this.denominator <0){
            this.denominator = (-1) * this.denominator;
            zhengfu = 1;
        }
        int lar = this.numerator;
        if (this.numerator < this.denominator){
            lar = this.denominator-1;
        }
        for(int i = lar ;i >1;i--){
            if (this.denominator % i == 0 && this.numerator % i == 0 ){
                count = i;
                if(count !=0){
                    this.numerator = this.numerator/count;
                    this.denominator = this.denominator/count;
                }
            }
        }
        if (zhengfu == 1){
            this.numerator = (-1) * this.numerator;
        }

    }

    // ==================================

}
