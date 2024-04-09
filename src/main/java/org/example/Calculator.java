package org.example;

public class Calculator {
    protected float value;

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
        this.value /= other;
    }

    public float getResult(){
        return this.value;
    }
}

