package com.example.ChicagoBakeries;

public class Bakery implements IBakery {
    public String generateBakeries(String rank) {
        switch (rank) {
            case "1":
                return "Tous Les Jours";
            case "2":
                return "Sweet Mandy B's";
            case "3":
                return "Maison Parisienne";
            case "4":
                return "Alliance Bakery & Cafe";
            case "5":
                return "Aya Pastry";
            case "6":
                return "Bake";
            case "7":
                return: "Chiu Quon Bakery & Dim Sum";
            case "8":
                return "Firecakes Donuts";
            case "9":
                return "Bjorn Cakes";
            default:
                return "Markellos Baking Company";
        }
    }
}

// 1: Tous Les Jours
// 2: Sweet Mandy B's
// 3: Maison Parisienne
// 4: Alliance Bakery & Cafe
// 5: Aya Pastry
// 6: Bake
// 7: Chiu Quon Bakery & Dim Sum
// 8: Firecakes Donuts
// 9: Bjorn Cakes
// 10: Markellos Baking Company