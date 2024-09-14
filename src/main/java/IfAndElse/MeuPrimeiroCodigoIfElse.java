package IfAndElse;

import java.util.Scanner;

public class MeuPrimeiroCodigoIfElse {

	public static void main(String[] args) {
		Scanner escrever = new Scanner(System.in);
		System.out.println("Bem vindo a Plataforma da Polícia Federal");
		System.out.println("Você acessou o menu Obter Passaporte");
		System.out.println("Se deseja obter seu Passaporte preencha os campos abaixo");
        System.out.println("Qual seu nome completo?");
        String nome = escrever.nextLine();
        System.out.println("Qual sua idade?");
        int idade = escrever.nextInt();
        escrever.nextLine(); 
        
        if (idade >= 23) {
            System.out.println(nome + ", você pode tirar seu passaporte");
        } else {
            System.out.println(nome + ", você só pode tirar seu passaporte com acompanhante");
        }

        System.out.println("Para concluir seu cadastro, preencha os campos abaixo");
        
        System.out.println("Digite  seu CPF");
        String cpf = escrever.nextLine();
        System.out.println("Informe seu endereço:");
        String endereco = escrever.nextLine();

        System.out.println("Qual o número da residencia?");
        int numero = escrever.nextInt();
        escrever.nextLine(); // Consome a nova linha após nextInt()

        System.out.println("Qual seu bairro?");
        String bairro = escrever.nextLine();

        System.out.println("Qual nome da cidade?");
        String cidade = escrever.nextLine();

        System.out.println(nome + ", verifique seus dados:");
        System.out.println("Nome completo: " + nome);
        System.out.println(idade + " anos ");
        System.out.println("Inscrita no cpf: " + cpf);
        System.out.println("Endereço: " + endereco  +  numero);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade);
        

        System.out.println("Obrigada, Aguarde as próximas intruções que enviaremos por e-mail!");

        escrever.close(); // Fechar o scanner após uso
	}
}