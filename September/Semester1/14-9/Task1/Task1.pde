void setup(){
 printLine("This is a parameter string.");
 printLine();
 printLine(info("Victor", 20));
}

void printLine(){
  println();
}

void printLine(String s){
  println(s);
}

String info(String name, int age){
  return "My name is "+name+ ", I am " + age + " years old.";
} 
