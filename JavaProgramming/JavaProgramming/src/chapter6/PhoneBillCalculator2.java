package chapter6;

//create a different class that instantiates the PhoneBill and prints out an itemized bill.


public class PhoneBillCalculator2 {

    public static void main(String args[]){

        PhoneBill bill = new PhoneBill();
        bill.setMinutesUsed(30000);
        bill.printBill();
    }


}
