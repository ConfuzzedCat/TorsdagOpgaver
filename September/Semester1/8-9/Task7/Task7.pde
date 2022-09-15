int input = -20;
if (input > 0 ) {
  for (int i = input; i >= 0; i--) {
    println(i);
  }
} else if (input == 0) {
  println("input is 0.");
} else {
  for (int i = input; i <= 0; i++) {
    println(i);
  }
}
