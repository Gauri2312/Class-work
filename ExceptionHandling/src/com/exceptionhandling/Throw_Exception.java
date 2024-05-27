package com.exceptionhandling;

public class Throw_Exception {
    public void canVote(int age){
        if(age<18)
            try{
                throw new Exception();
            }
            catch(Exception e){
                System.out.println("You are not an adult!");
            }

        else
            System.out.println("You can Vote!");
    }
        public static void main(String[] args){

            Throw_Exception t=new Throw_Exception();
            t.canVote(10);

        }
    }
    

