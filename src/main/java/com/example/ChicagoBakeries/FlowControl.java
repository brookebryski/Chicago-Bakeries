package com.example.ChicagoBakeries;

public class FlowControl implements IFlowControl {
    private IBakeryValidator _bakeryValidator;
    private IBakery _bakery;

    public FlowControl(IBakeryValidator bakeryValidator, IBakery bakery) {
        this._bakeryValidator = bakeryValidator;
        this._bakery = bakery;
    }

    public void run(String input) {
        if(_bakeryValidator.isBakery(input)) {
            String result = _bakery.generateBakeries(input);
            System.out.println(result);
        }
    }
}
