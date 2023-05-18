package matriz;
import java.util.*;
import java.lang.Math;

public class main {
	public static void main(String[] args) {

		int i,j;

		int [][] matriz = new int [10] [10];

		int A = new Random().nextInt(100);

		//int B = new Random().nextInt(100);

		int linha;

		int pixel;

		int n_up = 0,n_down = 0,n_left = 0,n_right = 0;


		for(i=0; i<10;i++) {

		for(j=0; j<10;j++) {

		matriz[i][j] = (int) (Math.random()*2);

		System.out.printf("%-3d",matriz[i][j]);

		}

		System.out.println();

		}


		System.out.println("\n");


		linha=A/10;

		pixel =A%10;


		//System.out.println(A);

		//System.out.println(linha+" "+pixel);


		System.out.println("Obs: As saidas de valores que estao com -1 significa que o valor e null/none por que nao consegui tratar de outra forma"+"\n");

		System.out.println("Linha: "+linha+" Pixel: "+pixel+"\n");


		System.out.println("4-Vizinhanca");


		if(linha > 0 ) {

		n_up = matriz[linha-1][pixel];

		}else {n_up=-1;}


		if(linha < 9 ) {

		n_down = matriz[linha+1][pixel];

		}else {n_down=-1;}


		if(pixel > 0 ) {

		n_left = matriz[linha][pixel-1];

		}else {n_left=-1;}


		if(pixel < 9 ) {

		n_right = matriz[linha][pixel+1];

		}else {n_right=-1;}





		int n4[] = {n_up,n_down,n_left,n_right};


		for(i=0; i<4; i++) {

		System.out.println(n4[i]);

		}



		System.out.println("\n");


		System.out.println("ND-Vizinhanca");


		if(linha < 9 & pixel > 0) {

		n_up = matriz[linha+1][pixel-1];

		}else {n_up=-1;}


		if(linha < 9 & pixel < 9 ) {

		n_down = matriz[linha+1][pixel+1];

		}else {n_down=-1;}


		if(pixel > 0 & linha > 0) {

		n_left = matriz[linha-1][pixel-1];

		}else {n_left=-1;}


		if(pixel < 9 & linha > 0) {

		n_right = matriz[linha-1][pixel+1];

		}else {n_right=-1;}


		int nd[] = {n_up,n_down,n_left,n_right};

		for(i=0;i<4;i++){

		System.out.println(nd[i]);

		}


		System.out.println("\n");


		System.out.println("8-Vizinhanca");


		/*int n8[] = {matriz[A+1][B],matriz[A-1][B],matriz[A][B+1],matriz[A][B-1],matriz[A+1][B+1],matriz[A+1][B-1],matriz[A-1][B+1],matriz[A-1][B-1]};

		for(i=0;i<8;i++){

		System.out.println(n8[i]);

		}*/

		int n8[] = new int[8];

		//System.arraycopy(n4, 0, n8, 0, 3);

		//System.arraycopy(nd, 0, n8, 4, 3);

		int contador = 0;

		for(i=0;i<8;i++){

		if(i < 4){

		n8[i]=n4[i];

		}


		if(i >3 & i < 8 ) {

		n8[i]=nd[contador];

		contador++;

		}


		}

		for(i=0;i<8;i++){

		System.out.println(n8[i]);

		}



		System.out.println("\n");


		/*int nd_01 = matriz[A+1][B+1];

		int nd_02 = matriz[A+1][B-1];

		int nd_03 = matriz[A-1][B+1];

		int nd_04 = matriz[A-1][B-1];*/


		System.out.println("Adjacencia-4");


		int ad1=0,ad2=0,ad3=0;


		if(pixel > 0) {

		ad1 = matriz[linha][pixel-1];

		}else {ad1 = -1;}


		if(linha < 9) {

		ad2 = matriz[linha+1][pixel];

		}else {ad2 = -1;}


		int a4[] = {ad1,ad2};

		for(i=0;i<2;i++){

		System.out.println(a4[i]);

		}


		System.out.println("\n");


		System.out.println("Adjacencia-8");


		if(linha > 0 & pixel > 0) {

		ad1 = matriz[linha-1][pixel-1];

		}else {ad1 = -1;}


		if(pixel > 0) {

		ad2 = matriz[linha][pixel-1];

		}else {ad2 = -1;}


		if(linha < 9 & pixel < 9) {

		ad3 = matriz[linha+1][pixel+1];

		}else {ad3 = -1;}


		int a8[] = {ad1,ad2,ad3};

		for(i=0;i<3;i++){

		System.out.println(a8[i]);

		}


		System.out.println("\n");


		System.out.println("Adjacencia-m");


		if(pixel > 0) {

		ad1 = matriz[linha][pixel-1];

		}else {ad1= -1;}


		if(linha < 9 & pixel < 9) {

		ad2 = matriz[linha+1][pixel+1];

		}else {ad2= -1;}


		int am[] = {ad1,ad2};

		for(i=0;i<2;i++){

		System.out.println(am[i]);

		}




		System.out.println("\n");


		//Distancia Euclidiana

		double parte1, parte2;

		double distancia;

		double teste [] [] = new double [10] [10];


		int a,d;


		for(a=0; a<10;a++) {

		for(d=0; d<10;d++) {

		teste[a][d] = (double) (Math.random()*2);

		//System.out.printf("%-3d",teste[a][d]);

		}

		//System.out.println();

		}

		double A1 = new Random().nextDouble(10);

		double A2 = new Random().nextDouble(10);

		double B1 = new Random().nextDouble(10);

		double B2 = new Random().nextDouble(10);


		parte1 = Math.pow(A2 - A1, 2);

		parte2 = Math.pow(B2 - B1, 2);


		distancia = Math.sqrt(parte1+parte2);


		System.out.println("Distancia euclidiana:"+distancia);


		//System.out.println("\n");


		//Distancia D4


		int matriz2 [][] = new int [10][10];

		int g,h;


		for(g=0; g<10;g++) {

		for(h=0; h<10;h++) {

		matriz2[g][h] = (int) (Math.random()*2);

		//System.out.printf("%-3d",matriz2[g][h]);

		}

		//System.out.println();

		}


		int W1 = new Random().nextInt(10);

		int W2 = new Random().nextInt(10);

		int S1 = new Random().nextInt(10);

		int S2 = new Random().nextInt(10);


		int pt1,pt2;

		if(W2 != 0 & S2 != 0) {

		pt1 = Math.floorMod(W1, W2);

		pt2 = Math.floorMod(S1, S2);

		int d4 = pt1+pt2;

		System.out.println("Distancia D4:"+d4);

		}else {

		System.out.println("None");

		}








		//System.out.println(matriz[A][B]);

		//System.out.println(A+" "+B);


		}

}
