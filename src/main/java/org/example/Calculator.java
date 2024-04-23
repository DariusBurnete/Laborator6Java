package org.example;

public class Calculator {
    protected float value = 0;

    public Calculator(){
    }

    public Calculator(float value) {
        this.value = value;
    }

    public void add(float other){
        this.value += other;
    }

    public void sub(float other){
        this.value -= other;
    }

    public void mul(float other){
        this.value *= other;
    }

    public void div(float other){
        if(other == 0) throw new ArithmeticException("Cannot divide by zero.");
        else {
            this.value /= other;
        }
    }

    public float getResult(){
        return this.value;
    }

}

