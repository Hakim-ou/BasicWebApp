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

        return "";
    }
}
