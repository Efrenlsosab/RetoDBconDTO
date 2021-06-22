package dto;

import java.sql.Timestamp;

public class CustommerDto {
    private Short customer_idDto;
    private Short store_idDto;
    private String first_nameDto;
    private String last_nameDto;
    private String emailDto;
    private Short address_idDto;
    private Short activeDto;
    private java.sql.Timestamp create_date;
    private byte[] last_update;

    public Short getCustomer_idDto() {
        return customer_idDto;
    }

    public void setCustomer_idDto(Short customer_idDto) {
        this.customer_idDto = customer_idDto;
    }

    public Short getStore_idDto() {
        return store_idDto;
    }

    public void setStore_idDto(Short store_idDto) {
        this.store_idDto = store_idDto;
    }

    public String getFirst_nameDto() {
        return first_nameDto;
    }

    public void setFirst_nameDto(String first_nameDto) {
        this.first_nameDto = first_nameDto;
    }

    public String getLast_nameDto() {
        return last_nameDto;
    }

    public void setLast_nameDto(String last_nameDto) {
        this.last_nameDto = last_nameDto;
    }

    public String getEmailDto() {
        return emailDto;
    }

    public void setEmailDto(String emailDto) {
        this.emailDto = emailDto;
    }

    public Short getAddress_idDto() {
        return address_idDto;
    }

    public void setAddress_idDto(Short address_idDto) {
        this.address_idDto = address_idDto;
    }

    public Short getActiveDto() {
        return activeDto;
    }

    public void setActiveDto(Short activeDto) {
        this.activeDto = activeDto;
    }

    public Timestamp getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }

    public byte[] getLast_update() {
        return last_update;
    }

    public void setLast_update(byte[] last_update) {
        this.last_update = last_update;
    }
}
