public String stringYak(String str) {
  String answ = "";
  int before;
	while(str.length()>0){
	  before = str.length();
	  answ += str.charAt(0);
	  str.replaceAll(String.valueOf(str.charAt(0)),"");
	  answ += String.valueOf(before-str.length());
	}
	return answ;
}