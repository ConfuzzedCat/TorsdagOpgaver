void setup(){
  Teacher tess = new Teacher("Tess", 48, true);
  Student victor = new Student("Victor", 20, false, 'B');
  Student deniz = new Student("Deniz", 38, false, 'B');
  
  println(tess.name);
  println("name: " + victor.name + ", team: " + victor.datamatikerTeam);
  println("name: " + deniz.name + ", team: " + deniz.datamatikerTeam);

}
