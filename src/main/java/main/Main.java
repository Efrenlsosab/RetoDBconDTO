package main;

import connection.ConnectionDb;
import consulta.Consulta;
import dto.ActorDto;
import dto.AddressDto;
import dto.Category;

import java.sql.*;


public class Main {
    public static void main(String[] args) {
         ConnectionDb conexion = new ConnectionDb();
        Consulta consulta = new Consulta();
         ActorDto actorDto = new ActorDto();
        AddressDto addressDto = new AddressDto();
        Category category = new Category();


        conexion.conectarBD();
        // consulta tabla actor y pasar a DTO correspondiente
        actorDto.setActor_idDto(consulta.consultaActor("actor_id"));
        actorDto.setFirst_nameDto(consulta.consultaActor("first_name"));
        actorDto.setLast_nameDto(consulta.consultaActor("last_name"));
        // consulta tabla address y pasar a DTO correspondiente
        addressDto.setAddressDto(consulta.consultaAddress("address"));
        addressDto.setAddressDto(consulta.consultaAddress("district"));
        addressDto.setAddressDto(consulta.consultaAddress("city_id"));
        addressDto.setAddressDto(consulta.consultaAddress("postal_code"));
        addressDto.setAddressDto(consulta.consultaAddress("phone"));
        addressDto.setAddressDto(consulta.consultaAddress("location"));
        // consulta tabla category y pasar a DTO correspondiente
        category.setCategory_idDto(consulta.consultarCategory("category_id"));
        category.setNameDto(consulta.consultarCategory("name"));
        conexion.cerrarBD();









    }
}
