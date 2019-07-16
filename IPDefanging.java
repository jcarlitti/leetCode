/*
Creator: Justin Carlitti
Date Completed: 7/12/19
Difficulty: Easy
ID #: 1108
Description:
Given a valid (IPv4) IP address, return a defanged version 
of that IP address. A defanged IP address replaces every 
period "." with "[.]".
*/

public class IPDefanging{

    public static String defangIPaddr(String address){
        return address.replace(".", "[.]");
    }

    public static void main(String[] args){
        System.out.println(defangIPaddr("1.1.1.1"));
    }
} 