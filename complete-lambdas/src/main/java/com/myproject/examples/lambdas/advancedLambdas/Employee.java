package com.myproject.examples.lambdas.advancedLambdas;

public class Employee {

    public Employee(int id){

    }

    public Employee(int id, String name){

    }

    interface EmployeId{
        public Employee create(int id);
    }

    interface EmployeeByName{
        public Employee create(int id, String name);
    }

    //Lambdas without using constructor references
    public void normalLambdaExpressions(){
        //Lambda invoking the first constructor - no const refs
        EmployeId empLambda = id -> new Employee(id);

        //Lambda invoking the second constructor - no const refs
        EmployeeByName empNameLambda = (id, name) -> new Employee(id, name);
    }

    //Lambdas with constructor references
    public void constructorReferenceLambdas(){
        //Both have the same constructor reference

        //Constructor reference invocation for first constructor
        EmployeId empLambdaConstRef = Employee::new;
        //Constructor reference invocation for second constructor
        EmployeeByName empNameLambdaConstRef = Employee::new;
    }
}
