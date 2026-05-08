package com.pluralsight;

public class Program {
    public static void main(String[] args) {
        UserInterface runner = new UserInterface();

        runner.display();
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        dealershipFileManager.saveDealership();

        //add in column method from capstone



    }
}
