package com.example.nguyen.myapplication;

/**
 * Created by nguyen on 8/27/15.
 */
public class Restaurant {
        private String name = "";
        private String address = "";
    private String type="";
public String getType(){
    return (type);
}
    public void setType(String type){
        this.type=type;
    }
        public String getName() {
            return (name);
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return (address);
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }