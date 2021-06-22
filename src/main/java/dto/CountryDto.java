package dto;

import java.util.ArrayList;

public class CountryDto {
    private ArrayList<Integer> country_idDto = new ArrayList<>();
    private ArrayList<String> countryDto = new ArrayList<>();

    public ArrayList<Integer> getCountry_idDto() {
        return country_idDto;
    }

    public void setCountry_idDto(ArrayList<Integer> country_idDto) {
        this.country_idDto = country_idDto;
    }

    public ArrayList<String> getCountryDto() {
        return countryDto;
    }

    public void setCountryDto(ArrayList<String> countryDto) {
        this.countryDto = countryDto;
    }
}
