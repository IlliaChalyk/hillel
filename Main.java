package com.hillel.lesson6;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] emails = {"alex.test@gmail.com", "alex.test@gmail.com", "alextest@gmail.com",
                "alextest+string@gmail.com", "alextest@ukr.net", "alextest@ukr.net",
                "test.email+alex@test.com","test.e.mail+bob.cathy@test.com","testemail+david@lee.test.com"};

        System.out.println("num of unique emails: " + numOfUniqueEmails(emails));
    }

    public static int numOfUniqueEmails(String[] emails) {

        StringBuilder firstPart;
        StringBuilder secondPart;
        HashSet uniqueEmails = new HashSet();

        for (int i = 0; i < emails.length; i++) {
            secondPart = new StringBuilder();
            firstPart = new StringBuilder();

            for (int j = 0; j < emails[i].length(); j++) {

                if (emails[i].charAt(j) != '@') {
                    firstPart.append(emails[i].charAt(j));
                } else {
                    secondPart.append(emails[i], j, emails[i].length());
                    break;
                }
            }

            for (int k = 0; k < firstPart.length(); k++) {
                if (firstPart.charAt(k) == '.') {
                    firstPart.deleteCharAt(k);
                } else if (firstPart.charAt(k) == '+') {
                    firstPart.delete(k, firstPart.length());
                }
            }
            String result = new String(firstPart.append(secondPart));
            uniqueEmails.add(result);
        }
        return uniqueEmails.size();
    }
}

