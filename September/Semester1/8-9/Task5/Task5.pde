void setup() {
  MethodOne();
  MethodTwo();
}

/*
  The following method has an error in it. Fix the error and run it.
 */

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line.

  int max = 10;
  String output = "Empty";

  if (i > max)
  {
    output = "i is greater than "+max+".";
  }

  println(output);
}

/*
 Finish the following method so that we can change the number assigned
 to the weekday and it prints the correct output.
 */
void MethodTwo()
{
  int weekDay = 100; // 0 = Monday, 6 = Sunday.
  boolean weekend = false;

  if (weekDay < 5)
  {
    weekend = false;
  } else
  {
    weekend = true;
  }

  // Print the name of the weekday here:
  print("Today is ");
  switch(weekDay) {
  case 0:
    println("monday.");
    break;
  case 1:
    println("tuesday.");
    break;
  case 2:
    println("wednesday.");
    break;
  case 3:
    println("thursday.");
    break;
  case 4:
    println("friday.");
    break;
  }


  // Print if it is weekend here:
  if (weekend) {
    switch(weekDay) {
    case 5:
      println("saturday, which is weekend.");
      break;
    case 6:
      println("sunday, which is weekend.");
      break;
    default:
      println("an invalid weekDay.");
      return;
    }
  }
}
