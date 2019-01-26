object Leap {
  def leapYear(year: Int) = {

    //Set up a return value.
    var result = false

    //Logic to confirm that the year is indeed a leap year.
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
      result = true
    }
    result
  }
}
