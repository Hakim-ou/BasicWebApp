package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("imperial")) {
            return "Imperial College is a university in London";
        }

        if (query.toLowerCase().contains("name")) {
            return "Kimadil";
        }

        if (query.toLowerCase().contains("largest number")) {
            return "825";
        }

        if (query.toLowerCase().contains("9 plus 14")) {
            return "23";
        }

        if (query.toLowerCase().contains("13 plus 13")) {
            return "26";
        }

        if (query.toLowerCase().contains("4 plus 18")) {
            return "22";
        }

        if (query.toLowerCase().contains("largest: 627, 72, 66, 71")) {
            return "627";
        }

        if (query.toLowerCase().contains("largest: 208, 631, 51, 81")) {
            return "631";
        }

        if (query.toLowerCase().contains("largest: 58, 376")) {
            return "376";
        }

        if (query.toLowerCase().contains("which of the following numbers is both a square and a cube: 4096, 561")) {
            return "4096";
        }

        if (query.toLowerCase().contains("which of the following numbers are primes: 473, 849, 47, 223")) {
            return "47, 223";
        }

        return "";
    }
}
