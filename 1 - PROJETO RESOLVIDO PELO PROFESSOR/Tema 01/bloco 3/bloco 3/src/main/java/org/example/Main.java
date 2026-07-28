package org.example;

import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        JSONObject cliente = new JSONObject();
        JSONObject cliente2 = new JSONObject();


        cliente.put("nome", "Marcel");
        cliente.put("cpf", "123456");
        cliente.put("telefone", "978787878");

        System.out.println(cliente);

        cliente2.put("nome", "José");
        cliente2.put("cpf", "987654");
        cliente2.put("telefone", "945454545");

        System.out.println(cliente2);

    }
}