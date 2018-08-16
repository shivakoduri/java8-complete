package com.myproject.examples.lambdas.advancedLambdas;

public class References {

    interface MoviceChecker {
        boolean check(int movieId);
    }

    interface Greeting {
        public String sayHello(String s);
    }

    private void instanceMethodRef(){
        ReferenceUtil util = new ReferenceUtil();
        //Lambda Version
        MoviceChecker isClassic = movieId -> util.isClassic(movieId);
        //Instance Method Ref version
        MoviceChecker isClassicLambda = util::isClassic;
    }

    private String greet(String s){
        return null;
    }

    //Method References
    private void exampleMethodReferences(){
        Greeting greetingLambdaReference = s -> {
            return greet(s);
        };

        //Lambda using a method reference
        Greeting greetingLambdaReference2 = this::greet;

        //Or
        Runnable r = () -> print();

        //using method references
        r = this::print;
    }

    private void print(){
        System.out.println();
    }

    //To check static method
    private void staticMethodRef(){
        //Lambda version
        MoviceChecker isClassic = movieId -> ReferenceUtil.isHorror(movieId);
        // Static Method Ref version
        MoviceChecker isClassicLambda = ReferenceUtil::isHorror;
    }

    //To check arbitray method reference functionality
    private void arbitaryMethodRef(){
        //Lambda version
        MoviceChecker boxofficeHit = ArbitaryClass::isBoxOfficeHit;
        //Static method ref version
        MoviceChecker isClassicLambda = ReferenceUtil::isHorror;
    }

    //An existing instance method to check if the movie fails in classic category
    public boolean isClassic(int movieId){
        boolean isClassic = false;
        if(movieId < 1000){
            isClassic = true;
        }
        return isClassic;
    }
}

class ArbitaryClass {
    public static boolean isBoxOfficeHit(int movieId){
        //logic in find the box office collections goes here.
        return true;
    }
}
