void setup(){
  println(sum(10,2882));
  println(toUpper("some string that was lower case."));
  println(isFirstCharUpper("This has a upper case letter at char 0."));s
}

int sum(int a, int b){
  return a+b;
}
//2.c
String toUpper(String s){
  return s.toUpperCase();
}

//2.d
boolean isFirstCharUpper(String s){
 return Character.isUpperCase(s.charAt(0));
}
