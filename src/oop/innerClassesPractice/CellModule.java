package oop.innerClassesPractice;

public class CellModule {

    public CellModule(){
        System.out.println("CellModule initialized.");
    }

    public void call(String phoneNumber){
        int length = 9;

        class SmartPhoneModule {
            private String phoneNumber;
            private int validNumber;

            public SmartPhoneModule(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public boolean isValid(){
                if(phoneNumber.length() != length) {
                    return false;
                }
                else{
                    try{
                        validNumber = Integer.parseInt(phoneNumber);
                        return true;
                    }
                    catch (NumberFormatException ex){
                        return false;
                    }
                }
            }

            public void dialIn(){
                if(isValid()){
                    System.out.printf("Calling the phone number %d.%n", validNumber);
                }
                else{
                    System.out.println("The Phone number is invalid. Please, correct the phone number.");
                }
            }
        }

        SmartPhoneModule smartPhone = new SmartPhoneModule(phoneNumber);
        smartPhone.dialIn();
    }
}
