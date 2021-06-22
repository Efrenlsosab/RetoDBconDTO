package dto;

import java.util.ArrayList;

public class AddressDto {
private ArrayList<String> addressDto = new ArrayList<>();
private ArrayList<String> districtDto = new ArrayList<>();
private  ArrayList<Integer> city_idDto = new ArrayList<>();
private ArrayList<String> postal_codeDto = new ArrayList<>();
private ArrayList<Long> phoneDto = new ArrayList<>();
private ArrayList<String> locationDto = new ArrayList<>();

    public ArrayList<String> getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(ArrayList<String> addressDto) {
        this.addressDto = addressDto;
    }

    public ArrayList<String> getDistrictDto() {
        return districtDto;
    }

    public void setDistrictDto(ArrayList<String> districtDto) {
        this.districtDto = districtDto;
    }

    public ArrayList<Integer> getCity_idDto() {
        return city_idDto;
    }

    public void setCity_idDto(ArrayList<Integer> city_idDto) {
        this.city_idDto = city_idDto;
    }

    public ArrayList<String> getPostal_codeDto() {
        return postal_codeDto;
    }

    public void setPostal_codeDto(ArrayList<String> postal_codeDto) {
        this.postal_codeDto = postal_codeDto;
    }

    public ArrayList<Long> getPhoneDto() {
        return phoneDto;
    }

    public void setPhoneDto(ArrayList<Long> phoneDto) {
        this.phoneDto = phoneDto;
    }

    public ArrayList<String> getLocationDto() {
        return locationDto;
    }

    public void setLocationDto(ArrayList<String> locationDto) {
        this.locationDto = locationDto;
    }

    @Override
    public String toString() {
        return "AddressDto{" +
                "addressDto=" + addressDto +
                ", districtDto=" + districtDto +
                ", city_idDto=" + city_idDto +
                ", postal_codeDto=" + postal_codeDto +
                ", phoneDto=" + phoneDto +
                ", locationDto=" + locationDto +
                '}';
    }
}
