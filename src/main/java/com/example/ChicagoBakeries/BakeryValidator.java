package com.example.ChicagoBakeries;

public class BakeryValidator implements IBakeryValidator {
    public boolean isBakery(String input) {
        switch (input) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
                return true;
            default:
                return false;
        }
    }
}
