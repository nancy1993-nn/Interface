package com.company;

public abstract class Employee implements Payable{

        public static double minwage=260;
        private String name;
        private int id;
        public Employee(String name, int id){
            this.name=name;
            this.id= id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
       // public double earning(){
        //    return 0;
      //  }
        abstract  double earning();
        @Override
        public double getpaymentAmount(){
            return earning();
        }
    }


