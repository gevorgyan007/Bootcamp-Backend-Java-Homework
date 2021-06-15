package com.company.VendingMachineTwo.Products.utility;

import com.company.VendingMachineTwo.Controller.Controller;

import java.util.InputMismatchException;

public class Command {
    private String command;

    private String productType;
    private int colNumber;
    private int countProduct;

    public Command(String command) {
        if (checkVal(command)) {
            this.command = command;
            splint();
        }else{
            try {
                throw  new InputMismatchException("Invalid Input format");
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
                Controller.start();
            }
        }
    }
    private boolean checkVal(String str) {
        if (str.length() == 5) {
            if (str.charAt(0) == 'A' || str.charAt(0) == 'B' ||
                    str.charAt(0) == 'C'|| str.charAt(0) == 'D'
                    && str.charAt(1) == ':'&& str.charAt(3) == ':') {
                if (str.charAt(2) <= '9' && str.charAt(2) >= '0'
                        && str.charAt(4) <= '9' && str.charAt(4) >= '0' ) {
                    return true;
                }
            }
        }
        return false;
    }


    private void splint(){
        String[] comm = command.split(":");
        productType = comm[0];
        colNumber = Integer.parseInt(comm[1]);
        countProduct = Integer.parseInt(comm[2]);
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getColNumber() {
        return colNumber;
    }

    public void setColNumber(int colNumber) {
        this.colNumber = colNumber;
    }

    public int getCountProduct() {
        return countProduct;
    }

    public void setCountProduct(int countProduct) {
        this.countProduct = countProduct;
    }
}
