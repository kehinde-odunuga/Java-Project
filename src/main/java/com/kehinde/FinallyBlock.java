package com.kehinde;

public class FinallyBlock {
    public static void main(String[] args) throws Exception {

        try{

            /*
            DB connected successfully
            Execute queries
            Validate the data and comparing from websites
            Closing connection
             */
            int i[] = new int[4];

            i[5] = 100;
            System.out.println("Closing the DB connection in try block");

        } catch (Exception e) {
            System.out.println("Error occured");
        } finally {
            System.out.println("Closing the DB connection in finally block");
        }

    }
}
