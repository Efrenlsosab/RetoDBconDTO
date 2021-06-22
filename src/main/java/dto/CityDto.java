package dto;

import java.util.ArrayList;

public class CityDto {
    private ArrayList<Integer> city_iddto = new ArrayList<>();
    private ArrayList<String> cityDto = new ArrayList<>();

    public ArrayList<Integer> getCity_iddto() {
        return city_iddto;
    }

    public void setCity_iddto(ArrayList<Integer> city_iddto) {
        this.city_iddto = city_iddto;
    }

    public ArrayList<String> getCityDto() {
        return cityDto;
    }

    public void setCityDto(ArrayList<String> cityDto) {
        this.cityDto = cityDto;
    }
}
