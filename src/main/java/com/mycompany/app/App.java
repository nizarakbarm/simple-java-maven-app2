package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    //private final String message = "Halo Saya Nizar!";
    private int sum;

    public App() {
	    this.sum=0;
    }

    public static void main(String[] args) {
        App app=new App();
	app.sumNumber(1,2);
        System.out.println(app.getMessage());
    }
    private void sumNumber(int a,int b) {
	    this.sum=a+b;
    }
    private final String getMessage() {
        return Integer.toString(this.sum);
    }

}
