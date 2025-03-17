package com.shashankjaincompany.Sec14;

import java.util.ArrayList;

public class Without_Java_Stream {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Abhishek");
        name.add("Mintu");
        name.add("Anjali");
        name.add("Rahul");
        name.add("Avinash");
        int count =0;
        for (int i =0; i< name.size();i++){
            String actualName = name.get(i);
            if(actualName.startsWith("A")){
                count++;
            }
        }
        System.out.println(count);
    }
}
