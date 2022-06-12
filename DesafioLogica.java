package desafio;

import java.util.Scanner;

public class DesafioLogica {

	public static void main(String[] args) {
		try {
			DesafioLogica d = new DesafioLogica();
			d.executar();
		} catch (Exception e) {
			
		}
	}
	
	public void executar() {
		try (Scanner sc = new Scanner(System.in)) {
			double precoUni=0, imposto=0, lucro=0;
			double valorImpostoC=0, valorImpostoTotalC=0, precoImpostoC=0, valorLucroC=0, valorLucroTotalC=0, precoLucroC=0, precoTotalC=0;
			double valorImpostoE=0, valorImpostoTotalE=0, precoImpostoE=0, valorLucroE=0, valorLucroTotalE=0, precoLucroE=0, precoTotalE=0;
			double valorImpostoV=0, valorImpostoTotalV=0, precoImpostoV=0, valorLucroV=0, valorLucroTotalV=0, precoLucroV=0, precoTotalV=0;
			int contador, quantidade;
			char categoria;
			
			for(contador=0; contador<=14; contador++) {
				System.out.printf("\nDigite o preço unitário: ");
				precoUni = sc.nextDouble();
				System.out.printf("\nDigite a quantidade: ");
				quantidade = sc.nextInt();
				System.out.printf("\nDigite a categoria: C [cama, mesa e banho],\nE [eletrodomésticos] e \nV [vestuário]");
				categoria = sc.next().charAt(0);
				categoria = Character.toUpperCase(categoria);
				
				switch(categoria) {
				case 'C':
					imposto = 37.41;
					valorImpostoC = precoUni * (imposto/100);
					valorImpostoTotalC = valorImpostoTotalC + (valorImpostoC*quantidade);
					precoImpostoC = precoUni * (1+(imposto/100));
					
					lucro = 30;
					valorLucroC = (precoUni + valorImpostoC) * (lucro/100);
					valorLucroTotalC = valorLucroTotalC + (valorLucroC * quantidade);
					precoLucroC = precoImpostoC * (1+(lucro/100));
					precoTotalC = precoTotalC + (precoLucroC * quantidade);
					break;
				case 'E':
					imposto = 43.14;
					valorImpostoE = precoUni * (imposto/100);
					valorImpostoTotalE = valorImpostoTotalE + (valorImpostoE * quantidade);
					precoImpostoE = precoUni * (1+(imposto/100));
					
					lucro = 35;
					valorLucroE = (precoUni + valorImpostoE) * (lucro/100);
					valorLucroTotalE = valorLucroTotalE + (valorLucroE * quantidade);
					precoLucroE = precoImpostoE * (1+(lucro/100));
					precoTotalE = precoTotalE + (precoLucroE * quantidade);
					break;
				case 'V':
					imposto = 38.42;
					valorImpostoV = precoUni * (imposto/100);
					valorImpostoTotalV = valorImpostoTotalV + (valorImpostoV * quantidade);
					precoImpostoV = precoUni * (1+(imposto/100));
					
					lucro = 50;
					valorLucroV = (precoUni + valorImpostoV) * (lucro/100);
					valorLucroTotalV = valorLucroTotalV + (valorLucroV * quantidade);
					precoLucroV = precoImpostoV * (1+(lucro/100));
					precoTotalV = precoTotalV + (precoLucroV * quantidade);
					break;
				default:
					System.out.println("\nOpção Inválida! O cadastro irá recomeçar.");
					this.executar();
				}
			}
			
			System.out.printf("\nValor total do imposto da categoria C: R$%.2f",valorImpostoTotalC);
			System.out.printf("\nValor total do lucro da categoria C: R$%.2f",valorLucroTotalC);
			System.out.printf("\nValor total dos produtos da categoria C: R$%.2f",precoTotalC);
			
			System.out.printf("\n\nValor total do imposto da categoria E: R$%.2f",valorImpostoTotalE);
			System.out.printf("\nValor total do lucro da categoria E: R$%.2f",valorLucroTotalE);
			System.out.printf("\nValor total dos produtos da categoria E: R$%.2f",precoTotalE);
			
			System.out.printf("\n\nValor total do imposto da categoria V: R$%.2f",valorImpostoTotalV);
			System.out.printf("\nValor total do lucro da categoria V: R$%.2f",valorLucroTotalV);
			System.out.printf("\nValor total dos produtos da categoria V: R$%.2f",precoTotalV);
			
			sc.close();
		}
	}	
}
