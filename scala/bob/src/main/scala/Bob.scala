object Bob {
  def response(statement: String): String = {
    //Basic response
    var result = "Whatever."
    if (statement.isEmpty() || statement.replace(" ", "").isEmpty())
      result ="Fine. Be that way!"
    else if (isShouting(statement))
      result = "Whoa, chill out!"
    else if (isQuestion(statement))
      result = "Sure."
    else if (isShouting(statement) && isQuestion(statement))
    result = "Calm down, I know what I'm doing!"

    result
  }

  //Function to check if the sentence has any words that are "shouted"
  def isShouting(statement: String): Boolean = {
    val res = statement.toUpperCase == statement && containsLetters(statement)
    res
  }

  def isQuestion (statement: String): Boolean ={
    val res = statement.charAt(statement.length()-1) == '?'
    res
  }

  def containsLetters(statement :String): Boolean = {
    //Nicked this off someone from stackoverflow.
    val res = statement.exists((('a' to 'z') ++ ('A' to 'Z')).toSet.contains(_))
    res
  }

}
