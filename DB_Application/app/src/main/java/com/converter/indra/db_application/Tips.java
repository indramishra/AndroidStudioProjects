package com.converter.indra.db_application;

/**
 * Created by Think.pad on 7/17/2017.
 */
class ERT{

}
interface ABc{
    public void fun1();
    public void fun2();
    public void fun3();
}


/**
 *
 */
public class Tips implements ABc  {
    /*int r = 5;
    int f = 5;
    int b = 5;
   int c = 5;
    int d = 5;
    int e = 5;*/

    @Override
    public void fun1() {

    }

    @Override
    public void fun2() {

    }

    @Override
    public void fun3() {

    }

    /**
     *
     * @param a
     * @param f
     * @param b
     * @param c
     * @param d
     * @param e
     */
    public Tips(int a, int f, int b, int c, int d, int e) {


        try {
            this.r = a;
            this.f = f;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
        }
    }

    public int getR() {
        return r;
    }

    public int getF() {
        return f;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

}
