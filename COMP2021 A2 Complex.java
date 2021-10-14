package hk.edu.polyu.comp.comp2021.assignment2.complex;

import javax.swing.text.rtf.RTFEditorKit;

public class Complex {
    public static void main(String[] args) {

    }
    // Task 3: add the missing fields
    private Rational real;
    private Rational imag;

    public Complex(Rational real, Rational imag) {
        // Task 4: complete the constructor
        this.real =real;
        this.imag =imag;
    }

    public Complex add(Complex other) {
        // Task 4: complete the method
        Rational rrr = this.real.add(other.real);
        Rational iii = this.imag.add(other.imag);
        Complex answer = new Complex(rrr , iii) ;
        return answer;
    }

    public Complex subtract(Complex other) {
        // Task 4: complete the method
        Rational rrr = this.real.subtract(other.real);
        Rational iii = this.imag.subtract(other.imag);
        Complex answer = new Complex(rrr , iii) ;
        return answer;
    }

    public Complex multiply(Complex other) {
        // Task 4: complete the method
//        Rational a = this.real.multiply(other.real);
//        Rational b = this.imag.multiply(other.imag);
//        Rational c = other.real.multiply(this.imag);
//        Rational d = other.imag.multiply(this.real);
        Rational a = new Rational(0,0);
        a.nb(this.real);
        Rational b = new Rational(0,0);
        b.nb(this.imag);
        Rational c = new Rational(0,0);
        c.nb(other.real);
        Rational d = new Rational(0,0);
        d.nb(other.imag);
        Rational rrr = this.real.multiply(other.real).subtract(this.imag.multiply(other.imag));
        Rational iii = d.multiply(a).add(b.multiply(c));
        Complex answer = new Complex(rrr , iii) ;
        return  answer;
    }

    public Complex divide(Complex other) {
        // Task 4: complete the method
        // you may assume 'other' is never equal to '0+/-0i'.
        Rational a = new Rational(0,0);
        a.nb(this.real);
        Rational b = new Rational(0,0);
        b.nb(this.imag);
        Rational c = new Rational(0,0);
        c.nb(other.real);
        Rational d = new Rational(0,0);
        d.nb(other.imag);

        Rational aa = new Rational(0,0);
        aa.nb(this.real);
        Rational bb = new Rational(0,0);
        bb.nb(this.imag);
        Rational cc = new Rational(0,0);
        cc.nb(other.real);
        Rational dd = new Rational(0,0);
        dd.nb(other.imag);

        Rational aaa = new Rational(0,0);
        aaa.nb(this.real);
        Rational bbb = new Rational(0,0);
        bbb.nb(this.imag);
        Rational ccc = new Rational(0,0);
        ccc.nb(other.real);
        Rational ddd = new Rational(0,0);
        ddd.nb(other.imag);


        Rational a1 = aaa.multiply(ccc);
        Rational a2 = bbb.multiply(ddd);
        Rational b1 = b.multiply(c);
        Rational b2 = a.multiply(d);
        Rational d1 = cc.multiply(cc);
        Rational d2 = dd.multiply(dd);


        Rational num1 = a1.add(a2);
        Rational num2 = b1.subtract(b2);
        Rational den1 = d1.add(d2);
        Rational rrr = num1.divide(den1);
        Rational iii = num2.divide(den1);
        Complex answer = new Complex(rrr , iii) ;
        return answer;
    }

    public void simplify() {
        // Task 4L complete the method
        this.real.simplify();
        this.imag.simplify();
    }

    public String toString() {
        // Task 4: complete the method
        String to1 =this.real+"";
        String to3 =this.imag+"";
        System.out.println(to1);
        return "("+to1+","+to3+")";
    }

    // ==================================

}
