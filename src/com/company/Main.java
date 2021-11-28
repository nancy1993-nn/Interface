package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Payable> Object = new ArrayList<>();
        Object.add(new Base("sami",4,,1000));
        Object.add(new Invoice("sheet","desc","50","3"));
        for (int i = 0; i < Object.size(); i++) {
            System.out.println(Object.get(i).getpaymentAmount());

        }
    }
}
