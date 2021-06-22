package dto;

import java.util.ArrayList;

public class InventoryDto {
    private ArrayList<Integer> inventory_idDto = new ArrayList<>();
    private ArrayList<Short> film_idDto = new ArrayList<>();
    private ArrayList<Short> store_idDto = new ArrayList<>();

    public ArrayList<Integer> getInventory_idDto() {
        return inventory_idDto;
    }

    public void setInventory_idDto(ArrayList<Integer> inventory_idDto) {
        this.inventory_idDto = inventory_idDto;
    }

    public ArrayList<Short> getFilm_idDto() {
        return film_idDto;
    }

    public void setFilm_idDto(ArrayList<Short> film_idDto) {
        this.film_idDto = film_idDto;
    }

    public ArrayList<Short> getStore_idDto() {
        return store_idDto;
    }

    public void setStore_idDto(ArrayList<Short> store_idDto) {
        this.store_idDto = store_idDto;
    }

    @Override
    public String toString() {
        return "InventoryDto{" +
                "inventory_idDto=" + inventory_idDto +
                ", film_idDto=" + film_idDto +
                ", store_idDto=" + store_idDto +
                '}';
    }
}
