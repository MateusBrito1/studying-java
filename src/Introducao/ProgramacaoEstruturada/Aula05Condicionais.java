package Introducao.ProgramacaoEstruturada;

public class Aula05Condicionais {
    public static void main(String[] args) {

        double annualSalary = 2.826;
        double firstFax = 9.70 / 100;
        double twoFax = 37.35 / 100;
        double threeFax = 49.50 / 100;
        double taxAmount;

        if (annualSalary <= 2826 ) {
            taxAmount = annualSalary * firstFax;
        } else if (annualSalary >= 2827 && annualSalary <= 4664) {
            taxAmount = annualSalary * twoFax;
        } else
            taxAmount = annualSalary * threeFax;

        System.out.println(taxAmount);
    }
}
