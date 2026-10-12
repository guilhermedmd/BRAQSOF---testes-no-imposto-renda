package com.me;

public class Main {
    public static void main(String[] args) {

            System.out.println(calculadora.calcularIr(2000));
        }

public class calculadora{
    public static String calcularIr(double rendaMensal){
         if (rendaMensal < 0) {
                throw new RuntimeException(
                    "Erro: renda não pode ser negativa."
                );
            } else if (rendaMensal <= 5000) {
                return "Isenção total (100%)";
            } else if (rendaMensal <= 5500) {
                return "Desconto de 75%";
            } else if (rendaMensal <= 6000) {
                return "Desconto de 50%";
            } else if (rendaMensal <= 6500) {
                return "Desconto de 25%";
            } else if (rendaMensal <= 7350) {
                return "Desconto de 10%";
            } else {
                return "Alíquota de 27,5%";
            }
        }
    } 
}
