package com.company;

public enum AddressType {
    EMAIL(1,"email адрес")
            {
                public void send(){
                    System.out.println("this is email address - send by inet");
                }
            },
    POST(2,"почтовый адрес")
            {
                public void send(){
                    System.out.println("this is post address - send by DHL");
                }

            },
    BILLING(3,"адрес для выставления счетов")
            {
                public void send(){
                    System.out.println("this is billing address - send by DHL");
                }
            };


    private String strValue;
    private int intValue;

    AddressType(int intValue,String strValue) {
        this.intValue=intValue;
        this.strValue=strValue;
    }

    public abstract void send();

    @Override
    public String toString() {
        return "AddressType{" +
                "strValue='" + strValue + '\'' +
                ", intValue=" + intValue +
                '}';
    }

    public String test(){
        if(this.name()=="EMAIL"){
            return "send email";
        } else {
            return "go to post";
        }
    }
}
