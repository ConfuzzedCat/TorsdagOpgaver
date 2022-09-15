Student[] students = new Student[10];

void setup() {
  students[0] = new Student("Marcus", 8, true, 'B');
  students[1] = new Student("Deniz", 38, true, 'B');
  students[2] = new Student("XX", 23, true, 'B');
  students[3] = new Student("Martin", 25, true, 'B');
  students[4] = new Student("Philip", 30, true, 'B');
  students[5] = new Student("Yolo", 40, true, 'B');
  students[6] = new Student("Anders", 26, true, 'B');
  students[7] = new Student("Julius", 24, true, 'B');
  students[8] = new Student("Jack", 25, true, 'B');
  students[9] = new Student("Dogus", 19, true, 'B');

  println(returnNameFromIndex(students, 2));
  println(returnNameFromIndex(students, 0));
  println(returnNameFromIndex(students, 5));
  
}

String returnNameFromIndex(Student[] array, int index) {
  return array[index].name;
}

int indexOfStudent(Student[] array, String searchName){
  for(int i = 0; i < array.length; i++){
    if(array[i].name == searchName){
      return i;
    }
  
  }
  return -1;
}
