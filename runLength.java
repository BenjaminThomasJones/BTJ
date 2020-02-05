public String stringYak(String str) {
  String answ = "";
	int nsc = 1; //number of same chars
	if(str.length()==0) return answ;
	if(str.length()==1) return str.charAt(0)+"1";
	for(int i = 0; i <= str.length()-2; i++){
		if(str.charAt(i)==str.charAt(i+1)) nsc++;
		else{
		  answ+=str.charAt(i)+String.valueOf(nsc);
			nsc=1;
		}
	}
	answ+=str.charAt(str.length()-1)+String.valueOf(nsc);
	return answ;
}


public String runLengthChecker(String1, String2){
	if(String1.equals(stringYak(String2))) return "True";
	return stringYak(String1);
}