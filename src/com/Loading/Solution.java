package com.Loading;
class Bicycle{
    String define_me(){
        return "I am cycle  with pedals.";
    }
}
class Motorcycle extends Bicycle{
    String define_me(){
        return "I am cycle with engine.";
    }

    Motorcycle(){
        System.out.println("Hi I am Motorcycle ,"+define_me());
        String temp=super.define_me();
        System.out.println("Hi I am cycle, "+temp);
    }
}

public class Solution {

    public static void main(String[] args) {
        Motorcycle m=new Motorcycle();

    }
}
