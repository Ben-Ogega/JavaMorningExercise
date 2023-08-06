package com.karacana.gotcha;

public class Gotcha {

    public static void main(String[] args) {
        //new Gotcha().go();

       try{
            new Gotcha().go();
        }
        catch (Error e){
            System.out.println("Ouch");
        }

       /*  try{
            new Gotcha().go();
        }
        catch (Exception e){
            System.out.println("Ouch 2");
        }*/
    }

    void go() {
        go();
    }
}
