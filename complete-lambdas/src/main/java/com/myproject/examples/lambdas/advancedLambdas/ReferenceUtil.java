package com.myproject.examples.lambdas.advancedLambdas;

public class ReferenceUtil {

    public boolean isClassic(int movieId) {
        boolean isClassic = false;
        if(movieId < 1000){
            isClassic =true;
        }
        return isClassic;
    }

    public static boolean isHorror(int moviedId){
        boolean isHorror = false;
        if(moviedId > 10000 && moviedId < 20000){
            isHorror =true;
        }
        return isHorror;
    }
}
