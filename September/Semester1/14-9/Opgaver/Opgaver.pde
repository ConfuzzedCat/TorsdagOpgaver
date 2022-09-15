int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
String[] names = {"John","Steve", "Benjamin", "Michelle", "Patrick", "Karin"};

println("Opgave 1");
int sum = 0;
for(int i : numbers){
  sum += i;
}
println(sum);

println("Opgave 2");

for(int i = 0; i < 6; i++){
  for(int j = 0; j < 10; j++){
    print("- ");
  }
  println();
}

println("Opgave 3");
int sum_ = 0;
for(int i : numbers){
  sum_ += i;
}
float avg = (float)sum_/numbers.length;
println(avg);

println("Opgave 4");
String contains = "";
boolean found = false;
for(String s : names){
  if(s == contains){
    println(s);
    found = true;
  }
}
if(!found){
  println("Couldn't find string in array");
}

println("Opgave 5");

String indexString  = "Karin";
int indexOfTestString = -1;
for(int i = 0; i < names.length; i++){
  if(names[i]==indexString){
    indexOfTestString = i;
  }
}

int indexInt  = 13;
int indexOfTestInt = -1;
for(int i = 0; i < numbers.length; i++){
  if(numbers[i]==indexInt){
    indexOfTestInt = i;
  }
}
println("StringTest: \"" + indexString+ "\", index: " + indexOfTestString);
println("intTest: " + indexInt+ ", index: " + indexOfTestInt);

println("Opgave 6");
String[] tempNames = names;
String nameToBeRemoved = "Benjamin";
for(int i = 0; i < tempNames.length; i++){
  if(tempNames[i] == nameToBeRemoved){
    tempNames[i] = "";    
  }
}
for(String s : tempNames){
  println(s);
}
int[] tempNumbers = numbers;
int intToBeRemoved = 12;
for(int i = 0; i < tempNumbers.length; i++){
  if(tempNumbers[i] == intToBeRemoved){
    tempNumbers[i] = 0;    
  }
}
for(int i : tempNumbers){
  println(i);
}

println("Opgave 7");

int[] newNumbers = new int[numbers.length];
for(int i = 0; i < numbers.length; i++){
  newNumbers[i] = numbers[i];
  println("Set newNumbers["+ i +"] to " + numbers[i]);
}
String[] newNames = new String[names.length];
for(int i = 0; i < names.length; i++){
  newNames[i] = names[i];
  println("Set newNames["+ i +"] to " + names[i]);
}

println("Opgave 8");

int maxValue = 0;
for(int n : numbers){
  maxValue = Math.max(maxValue, n);
}
println("Max value of numbers: " + maxValue);

println("Opgave 9");
int indexTemp = 0;
for(int i = numbers.length; i > 0; i--){
  numbers[i] = numbers[indexTemp];
  print(numbers[i]+", ");
  indexTemp++;
}
println();

println("Opgave 10");
