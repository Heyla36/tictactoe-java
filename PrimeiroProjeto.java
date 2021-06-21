package tictactoe;

import java.util.Scanner;

public class PrimeiroProjeto {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char[][] tictactoe = new char[3][3];
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		int opcao;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;
		
		while(!ganhou) {
			System.out.println("Para iniciar digite 1");
			System.out.println("Para sair digite 0");
			
			opcao = scan.nextInt();
			
			if(opcao == 1) {
				
				if(jogada % 2 == 1){ //jogador 1
					System.out.println("Vez do jogador 1. Escolha a linha e a coluna (1-3). ");
					sinal = 'x';
				}else {
					System.out.println("Vez do jogador 2. Escolha a linha e a coluna (1-3). ");
					sinal = 'o';
				}
				
				boolean linhaValida = false;
				
				while(!linhaValida) {
					System.out.println("Digite a linha ( 1,2,3 )");
					linha = scan.nextInt();
					
					if(linha >= 1 && linha <=3) {
						linhaValida = true;
					}else {
						System.out.println("Entrada inválida entre com uma linha diferente");
						
					}
				}
				
				boolean colunaValida = false;
				
				while(!colunaValida) {
					System.out.println("Digite a coluna (1,2,3)");
					coluna = scan.nextInt();
					
					if(coluna >= 1 && coluna <= 3) {
						colunaValida = true;
					}else {
						System.out.println("Entrada inválida entre com uma coluna diferente");
					}
				}
				
				linha--;
				coluna--;
				if(tictactoe[linha][coluna] == 'x' || tictactoe[linha][coluna] == 'o' ) {
					System.out.println("Posição já usada, tente novamente.");				
						
				}else { // jogada válida
					tictactoe[linha][coluna] = sinal;
					jogada++;
				}
				
				//IMPRESSÃO DO TABULEIRO	
				
				for(int i = 0; i < tictactoe.length; i++) {
					for(int j = 0; j < tictactoe[i].length; j++) {
						System.out.print(tictactoe[i][j] + "|");
					}
					System.out.println();
				}
				
				//GANHADOR
				
				if((tictactoe[0][0] == 'x' && tictactoe[0][1] == 'x' && tictactoe[0][2] == 'x') || //linha 1
						(tictactoe[1][0] == 'x' && tictactoe[1][1] == 'x' && tictactoe[1][2] == 'x')|| //linha 2
							(tictactoe[2][0] == 'x' && tictactoe[2][1] == 'x' && tictactoe[2][2] == 'x') || // linha 3
								(tictactoe[0][0] == 'x' && tictactoe[1][0] == 'x' && tictactoe[2][0] == 'x') || //coluna 1
									(tictactoe[0][1] == 'x' && tictactoe[1][1] == 'x' && tictactoe[2][1] == 'x') || //coluna 2
										(tictactoe[0][2] == 'x' && tictactoe[1][2] == 'x' && tictactoe[2][2] == 'x') || //coluna 3
											(tictactoe[0][0] == 'x' && tictactoe[1][1] == 'x' && tictactoe[2][2] == 'x')) { //diagonal 
					
					ganhou = true;
					System.out.println("Parabéns, jogador 1 venceu!");
					
				} else if ((tictactoe[0][0] == 'o' && tictactoe[0][1] == 'o' && tictactoe[0][2] == 'o') || //linha 1
							(tictactoe[1][0] == 'o' && tictactoe[1][1] == 'o' && tictactoe[1][2] == 'o')|| //linha 2
								(tictactoe[2][0] == 'o' && tictactoe[2][1] == 'o' && tictactoe[2][2] == 'o') || // linha 3
									(tictactoe[0][0] == 'o' && tictactoe[1][0] == 'o' && tictactoe[2][0] == 'o') || //coluna 1
										(tictactoe[0][1] == 'o' && tictactoe[1][1] == 'o' && tictactoe[2][1] == 'o') || //coluna 2
											(tictactoe[0][2] == 'o' && tictactoe[1][2] == 'o' && tictactoe[2][2] == 'o') || //coluna 3
												(tictactoe[0][0] == 'o' && tictactoe[1][1] == 'o' && tictactoe[2][2] == 'o')) { // diagonal
					
					ganhou = true;
					System.out.println("Parabéns, jogador 1 venceu!");
				
				}else if (jogada > 9) {
					ganhou = true;
					System.out.println("Ninguém ganhou");
				}
				
			}else if (opcao == 0) {
				ganhou = true;
			
			}else {
				System.out.println("Insira um valor válido");
			}
		}
		
		scan.close();
	}

}


