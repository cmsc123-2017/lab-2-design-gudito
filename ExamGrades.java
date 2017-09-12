class ExamGrades {
  double grades[];
  
  ExamGrades(double grades[]) {
    this.grades = grades;
  }
  
  // -> double  
  // returns the highest grade in this exam grades
  double highestGrades() {
    double highest = 0;
    for (int i = 0; i < this.grades.length; i++){
      if (this.grades[i] > this.grades[i+1]){
        highest = this.grades[i];
      }
    }
     return highest;
  }
}
