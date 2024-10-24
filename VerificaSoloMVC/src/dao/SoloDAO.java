package dao;

import dto.SoloDTO;

public class SoloDAO {
    public String verificaSolo(SoloDTO solo){
        int agua = solo.getAgua();
        String message = "Quantidade de água inválida";

        if(agua <= 10){
            message = "Rochoso";
        }
        if(agua > 10 && agua <= 40){
            message = "Firme";
        }
        if(agua > 40 && agua <= 80){
            message = "Pantoso";
        }

        return message;

    }
}
