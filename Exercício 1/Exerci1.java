import java.util.Scanner;
public class Exerci1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int dia,m�s,ano;

			Scanner le= new Scanner(System.in);
			ano=dataAno(le);
			dia=dataDia(le);
			m�s=dataMes(le,dia,ano);
			dataEstacao(le,dia,m�s,ano);
			le.close();
		}
		public static int dataAno(Scanner le) {    // l� e valida o ano
			int ano;
			System.out.print("Ano: ");
			while(!le.hasNextInt()) {
				System.out.print("Deve inserir um n�mero\n" );
				System.out.print("Ano: " );

				le.next();
			}
			ano= le.nextInt();
			while (ano<0 || ano>3000) {          // intervalo v�lido 
				System.out.print("Ano inv�lido.\n ");
				System.out.print("Ano: ");
				ano= le.nextInt();
			}
			return ano;
		}

		
		public static int dataDia(Scanner le) {   // l� e valida o dia
			int dia;
			System.out.print("Dia: ");
			while(!le.hasNextInt()) {
				System.out.print("Deve inserir um n�mero\n" );
				System.out.print("Dia: " );
			
				le.next();
			}
			dia= le.nextInt();
			while (dia<1 || dia>31) {
				System.out.print("Dia inv�lido.\n ");
				System.out.print("Dia: ");
				dia= le.nextInt();
			}
			return dia;
		}
		public static int dataMes(Scanner le,int dia,int ano) {   // l� e valida o m�s
			int m�s;
			System.out.print("M�s: ");
			while(!le.hasNextInt()) {
				System.out.print("Deve inserir um n�mero\n" );
				System.out.print("M�s: " );

				le.next();
			}
			m�s= le.nextInt();
			while (m�s<1 || m�s>12) {   
				System.out.print("M�s inv�lido.\n ");
				System.out.print("M�s: ");
				m�s= le.nextInt();
			}
			while (((m�s==4 || m�s==6 || m�s==9 || m�s==11)&& dia>30)||((m�s==2 && ano%4==0)&& dia>29)||((m�s==2 && ano%4 != 0)&& dia>28)) {
				System.out.print("M�s inv�lido.\n");
				System.out.print("M�s: ");
				m�s=le.nextInt();
				}

			return m�s;
		}
		public static void dataEstacao(Scanner le, int dia,int m�s,int ano) {   //Devolve a esta��o e a figura correspondente
			int n;
			if((m�s==3 && dia>=20)||(m�s==4)||(m�s==5)||(m�s==6 && dia<21)){
				System.out.print("� Primavera.\n");
				
				// l� e valida o valor escolhido para o lado da figura
				System.out.print("Tamanho para o lado: ");
				while(!le.hasNextInt()) {
					System.out.print("Deve inserir um n�mero\n" ); 
					System.out.print("Tamanho para o lado: " );
					le.next();
				}
				n= le.nextInt();
				
				// j-linhas; i-colunas
				//para cada linha j, percorre as colunas i colocando espa�os ou asteriscos;
				for(int j=0;j<n;j++) {
					for(int i=0;i<2*n+3;i++) {
						if (i==j||i==j+1||i==n+1||i==2*n-j+2||i==2*n-j+1)
							System.out.print("*");
						else
							System.out.print(" ");
						}
					System.out.print("\n"); 
				}
				for(int j=0;j<n;j++) {
					for(int i=0;i<2*n+3;i++) {
						if (i==j||i==j+1||i==n+1||i==2*n-j+2||i==2*n-j+1)
							System.out.print("*");
						else
							System.out.print(" ");
						}
					System.out.print("\n");
					}
			}

			else if((m�s==6 && dia>=21)||(m�s==7)||(m�s==8)||(m�s==9 && dia<23)) {
				System.out.print("� Ver�o.\n");
				
				// l� e valida o valor escolhido para o lado da figura
				System.out.print("Tamanho para o lado: ");
				while(!le.hasNextInt()) {
					System.out.print("Deve inserir um n�mero\n" );
					System.out.print("Tamanho para o lado: " );
					le.next();
				}
				n= le.nextInt();
				
				// j-linhas; i-colunas
				//para cada linha j, percorre as colunas i colocando espa�os ou asteriscos;
				for(int j=0;j<n;j++) {
					for(int i=0;i<2*n;i++) {
						if (i==(n-1-j)||i==(n+j))
							System.out.print("*");
						else
							System.out.print(" ");
						}
					System.out.print("\n"); 
				}
				for(int j=0;j<n;j++) {
					for(int i=0;i<2*n;i++) {
						if (i==j||i==(2*n-1-j))
							System.out.print("*");
						else
							System.out.print(" ");
						}
					System.out.print("\n");
				}
			}

			else if((m�s==9 && dia>=23)||(m�s==10)||(m�s==11)||(m�s==12 && dia<21)) {
				System.out.print("� Outono.\n");
				
				// l� e valida o valor escolhido para o lado da figura
				System.out.print("Tamanho para o lado: ");
				while(!le.hasNextInt()) {
					System.out.print("Deve inserir um n�mero\n" );
					System.out.print("Tamanho para o lado: " );
					le.next();}

				n= le.nextInt();
				
				//j-linhas; i-colunas
				//para cada linha j, percorre as colunas i colocando espa�os ou asteriscos;
				for(int j=0;j<n;j++) {
					for(int i=0;i<2*n+4;i++) {
						if (i==(n-1-j)||i==(n-j)||i==(n-j+1)||i==(n+2+j)||i==(n+3+j)||i==(n+4+j))
							System.out.print("*");
						else
							System.out.print(" ");
						}
					System.out.print("\n"); 
				}
				for(int j=0;j<n;j++) {
					for(int i=0;i<2*n+4;i++) {
						if (i==j||i==(j+1)||i==(j+2)||i==(2*n+3-j)||i==(2*n+2-j)||i==(2*n+1-j))
							System.out.print("*");
						else
							System.out.print(" ");
						}
					System.out.print("\n");
				}
			}

			else if((m�s==12 && dia>=21)||(m�s==3 && dia<20)||m�s==2||m�s==1) {
				System.out.print("� Inverno.\n");
				
				// l� e valida o valor escolhido para o lado da figura
				System.out.print("Tamanho para o lado: ");
				while(!le.hasNextInt()) {
					System.out.print("Deve inserir um n�mero\n" );
					System.out.print("Tamanho para o lado: " );
					le.next();
				}
				n= le.nextInt();

				//j-linhas; i-colunas
				//para cada linha j, percorre as colunas i colocando espa�os ou asteriscos;
				
				for(int j=0;j<n;j++) {
					for(int i=0;i<2*n+1;i++) {
						if (i==j||i==n||i==2*n-j)
							System.out.print("*");
						else
							System.out.print(" ");
						}
					System.out.print("\n"); 
				}
				for(int j=0;j<n;j++) {
					for(int i=0;i<2*n+1;i++) {
						if (i==n-1-j||i==n||i==n+1+j)
							System.out.print("*");
						else
							System.out.print(" ");
						}
					System.out.print("\n");
				}
			}
		}
}
