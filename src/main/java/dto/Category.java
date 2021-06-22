package dto;

import java.util.ArrayList;

public class Category {
    private ArrayList<Short> category_idDto = new ArrayList<>();
    private ArrayList<String> nameDto = new ArrayList<>();

    public ArrayList<Short> getCategory_idDto() {
        return category_idDto;
    }

    public void setCategory_idDto(ArrayList<Short> category_idDto) {
        this.category_idDto = category_idDto;
    }

    public ArrayList<String> getNameDto() {
        return nameDto;
    }

    public void setNameDto(ArrayList<String> nameDto) {
        this.nameDto = nameDto;
    }

    @Override
    public String toString() {
        return "Category{" +
                "category_idDto=" + category_idDto +
                ", nameDto=" + nameDto +
                '}';
    }
}
