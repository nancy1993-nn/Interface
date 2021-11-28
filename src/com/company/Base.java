package com.company;


    public class Base extends Employee{
        private double salary;
        public Base(String name, int id, double salary){
            super(name , id);
            // this.salary=salary; فيها مشكلة ما ح يكون اكتلر من راتب الدولة
            setsalary(salary);

        }

        public void setsalary(double salary) {
            if(salary>= Employee.minwage)
                this.salary=salary;
            else
                salary=Employee.minwage;
        }

        public double getSalary() {
            return salary;
        }
        @Override
        public double earning(){
            return salary;
        }

        @Override
        public String toString() {
            // return String.format("Name:%s\nID:%d",getName(),getId());
            return super.toString()+"\nsalary:" +salary;
        }
}
