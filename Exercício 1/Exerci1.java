import java.util.Scanner;
public class Exerci1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int dia,mês,ano;

			Scanner le= new Scanner(System.in);
			ano=dataAno(le);
			dia=dataDia(le);
			mês=dataMes(le,dia,ano);
			dataEstacao(le,dia,mês,ano);
			le.close();
		}
		public static int dataAno(Scanner le) {    // lê e valida o ano
			int ano;
			System.out.print("Ano: ");
			while(!le.hasNextInt()) {
				System.out.print("Deve inserir um número\n" );
				System.out.print("Ano: " );

				le.next();
			}
			ano= le.nextInt();
			while (ano<0 || ano>3000) {          // intervalo válido 
				System.out.print("Ano inválido.\n ");
				System.out.print("Ano: ");
				ano= le.nextInt();
			}
			return ano;
		}

		
		public static int dataDia(Scanner le) {   // lê e valida o dia
			int dia;
			System.out.print("Dia: ");
			while(!le.hasNextInt()) {
				System.out.print("Deve inserir um número\n" );
				System.out.print("Dia: " );
			
				le.next();
			}
			dia= le.nextInt();
			while (dia<1 || dia>31) {
				System.out.print("Dia inválido.\n ");
				System.out.print("Dia: ");
				dia= le.nextInt();
			}
			return dia;
		}
		public static int dataMes(Scanner le,int dia,int ano) {   // lê e valida o mês
			int mês;
			System.out.print("Mês: ");
			while(!le.hasNextInt()) {
				System.out.print("Deve inserir um número\n" );
				System.out.print("Mês: " );

				le.next();
			}
			mês= le.nextInt();
			while (mês<1 || mês>12) {   
				System.out.print("Mês inválido.\n ");
				System.out.print("Mês: ");
				mês= le.nextInt();
			}
			while (((mês==4 || mês==6 || mês==9 || mês==11)&& dia>30)||((mês==2 && ano%4==0)&& dia>29)||((mês==2 && ano%4 != 0)&& dia>28)) {
				System.out.print("Mês inválido.\n");
				System.out.print("Mês: ");
				mês=le.nextInt();
				}

			return mês;
		}
		public static void dataEstacao(Scanner le, int dia,int mês,int ano) {   //Devolve a estação e a figura correspondente
			int n;
			if((mês==3 && dia>=20)||(mês==4)||(mês==5)||(mês==6 && dia<21)){
				System.out.print("É Primavera.\n");
				
				// lê e valida o valor escolhido para o lado da figura
				System.out.print("Tamanho para o lado: ");
				while(!le.hasNextInt()) {
					System.out.print("Deve inserir um número\n" ); 
					System.out.print("Tamanho para o lado: " );
					le.next();
				}
				n= le.nextInt();
				
				// j-linhas; i-colunas
				//para cada linha j, percorre as colunas i colocando espaços ou asteriscos;
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

			else if((mês==6 && dia>=21)||(mês==7)||(mês==8)||(mês==9 && dia<23)) {
				System.out.print("É Verão.\n");
				
				// lê e valida o valor escolhido para o lado da figura
				System.out.print("Tamanho para o lado: ");
				while(!le.hasNextInt()) {
					System.out.print("Deve inserir um número\n" );
					System.out.print("Tamanho para o lado: " );
					le.next();
				}
				n= le.nextInt();
				
				// j-linhas; i-colunas
				//para cada linha j, percorre as colunas i colocando espaços ou asteriscos;
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

			else if((mês==9 && dia>=23)||(mês==10)||(mês==11)||(mês==12 && dia<21)) {
				System.out.print("É Outono.\n");
				
				// lê e valida o valor escolhido para o lado da figura
				System.out.print("Tamanho para o lado: ");
				while(!le.hasNextInt()) {
					System.out.print("Deve inserir um número\n" );
					System.out.print("Tamanho para o lado: " );
					le.next();}

				n= le.nextInt();
				
				//j-linhas; i-colunas
				//para cada linha j, percorre as colunas i colocando espaços ou asteriscos;
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

			else if((mês==12 && dia>=21)||(mês==3 && dia<20)||mês==2||mês==1) {
				System.out.print("É Inverno.\n");
				
				// lê e valida o valor escolhido para o lado da figura
				System.out.print("Tamanho para o lado: ");
				while(!le.hasNextInt()) {
					System.out.print("Deve inserir um número\n" );
					System.out.print("Tamanho para o lado: " );
					le.next();
				}
				n= le.nextInt();

				//j-linhas; i-colunas
				//para cada linha j, percorre as colunas i colocando espaços ou asteriscos;
				
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
