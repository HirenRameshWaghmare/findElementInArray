package com.nisren.findelement;

public class Main {

    public static void main(String[] args) {
	Main main = new Main();
	int[] numberArray = {1,2,3,4,5};
	main.findElementInArray(numberArray, 5);
    }

    private void findElementInArray(int[] numberArray, int valueToSearch){
        for (int i = 0; i < numberArray.length; i++){
            if (numberArray[i] == valueToSearch){
                System.out.println("The value: "+valueToSearch+" is found at index : "+numberArray[i]);
                return;
            }
        }
        System.out.println("The element with the value "+valueToSearch+" was not found in the given array");
    }
}
