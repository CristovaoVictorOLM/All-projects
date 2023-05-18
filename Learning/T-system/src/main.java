import java.util.ArrayList;
import java.util.List;

public class main {
	  
	public static void main(String[] args) {
		String [] strArr = new String[] {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"};
		
		String StringArray = strArr[0];
	    String [] MultStringArray = new String[1];
	    List<String> test =  new ArrayList<String>();
	    MultStringArray[0] = strArr[1];
	    String [] Goiais = new String[2];
	    
	    boolean conf1 = false;
	    boolean conf2 = false;
	    
	    String concat1 = "";
	    String concat3 = ",";
	    String concat2 = "";
	    String token = ":klc0edur48";
		
		String s = strArr[0];
		
		List<String> list = new ArrayList<String>();
	    for(int i = 0; i < s.length(); i++){
	        for(int j = i+1; j <= s.length(); j++){
	            list.add(s.substring(i,j));
	        }
	    }
	    
	    String [] Testando = list.toArray(new String[list.size()]);
	    
	    String [] s1 = MultStringArray[0].split(",");
	    
	    Goiais[0] = Testando[3];
	    Goiais[1] = Testando[29];
	    
	    for(int i = 0; i < s1.length; i++){
	    	//System.out.println(s1[i]);
	        if(s1[i].equals(Goiais[0])){
	          conf1 = true;
	          //System.out.println(conf1);
	        }
	        if(s1[i].equals(Goiais[1])){
	          conf2 = true;
	        }
	    }
	    
	    if(conf1 == true && conf2 == true){
	        concat1 = Goiais[0];
	        concat2 = Goiais[1];
	        concat1 += concat3 + concat2 + token;
	        String reversing = new StringBuilder(concat1).reverse().toString();
	        System.out.println(reversing);
	    }else{
	      
	    }
	   
	    
	    //System.out.println(Testando[29]);
	    //System.out.println(list);
	    //System.out.println(s1[3]);
	    //System.out.println(conf1);
	    
	    
	    
	    
		
		/*String [] StringArray = new String[1];
	    String [] MultStringArray = new String[1];
	    List<String> test =  new ArrayList<String>();
	    StringArray[0] = strArr[0];
	    MultStringArray[0] = strArr[1];
	    
	    String s = StringArray[0];*/
	    
	    //String [] s1 = StringArray[0].split("(?=b)(?<=l)");
	    
	    
	    
	    /*List<String> list = new ArrayList<String>();
	    for(int i = 0; i < s.length(); i++){
	        for(int j = i+1; j <= s.length(); j++){
	            list.add(s.substring(i,j));
	        }
	    }
	    
	    String Start = StringArray[0];
	    String[] dbook = MultStringArray[0].
	    
	    String [] Test = new String[list.size()];*/
	    
	    //System.out.println(lpart);
	    //System.out.println(list);
	    
	    /*import java.util.*; 
import java.io.*;

class Main {

  public static String ArrayChallenge(String[] strArr) {
    // code goes here 
    
    //List<String> test =  new ArrayList<String>();
    String StringArray = strArr[0];
    String [] MultStringArray = new String [1];
    MultStringArray[0] = strArr[1];
    String [] s1 = MultStringArray[0].split(",");
    String [] FinalOutput = new String[1];

    boolean conf1 = false;
    boolean conf2 = false;

    String concat1 = "";
    String concat3 = ",";
    String concat2 = "";
    String token = ":klc0edur48";

    //I was copying and pasting my code that i did on my eclipse. I didn't know that i couldnt copy and paste

    String [] Goiais = new String[2];

    String s = strArr[0];
    List<String> list = new ArrayList<String>();
    for(int i = 0; i < s.length(); i++){
      for(int j = i+1; j <= s.length(); j++){
        list.add(s.substring(i,j));
      }
    }

    String [] Testando = list.toArray(new String[list.size()]);
    
    Goiais[0] = Testando[3];
    Goiais[1] = Testando[29];

    for(int i = 0; i < s1.length; i++){
        if(s1[i].equals(Goiais[0])){
          conf1 = true;
        }
        if(s1[i].equals(Goiais[1])){
          conf2 = true;
        }
    }

    if(conf1 == true && conf2 == true){
        concat1 = Goiais[0];
        concat2 = Goiais[1];
        concat1 += concat3 + concat2 + token;
        String reversing = new StringBuilder(concat1).reverse().toString();
        FinalOutput[0] = reversing;
    }else{
      return "Not possible";
    }

    


    return FinalOutput[0];
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ArrayChallenge(s.nextLine())); 
  }

}*/
	    
	    
	    /*import java.util.*; 
import java.io.*;

class Main {

  public static String StringChallenge(String str) {
    // code goes here  
    String [] separando = str.toLowerCase().replaceAll("([^a-z])", " ").replaceAll(" +", " ").trim().split(" ");
    StringBuilder camelcase = new StringBuilder();
    String [] palavras = separando;
    int inicio = 0;

    for(String palavra: palavras){
      if(inicio == 0){
        camelcase.append(palavra);
      }else{
        camelcase.append(palavra.substring(0, 1).toUpperCase()).append(palavra.substring(1));
      }
      inicio++;
    }

    String final_resultado = camelcase.toString();
    String token = ":klc0edur48";
    final_resultado += token;
    String final_resultado_reverso = new StringBuilder(final_resultado).reverse().toString();

    return final_resultado_reverso;
            
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(StringChallenge(s.nextLine())); 
  }

}*/
	    
	}
	
		
	}
		



